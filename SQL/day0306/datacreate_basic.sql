# 데이터 만들기(CREATE)
   /* create table 테이블명 -- 되도록이면 한글 자제, 특수 기호는 _만 사용
	  (컬럼명 데이터타입 [제약조건], -- 제약조건은 생략 가능/, 없이 공백 하나로 구분
      컬럼명 데이터타입 [제약조건],
      ...
      컬럼명 데이터타입 -- 칼럼명은 30글자 이내로
      );
   */

 /* MySQL의 데이터 타입
	- 숫자
		* 정수: int를 주로 사용
			1) smallint: 작은 범위의 int
			2) mediumint: 중간 범위의 int
			3) bigint: 큰 범위의 int
        * 실수: decimal을 주로 사용
			1) decimal(전체자리수, 소수점 뒤 자리수)
				ex) decimal (2, 3) => 00.000
				최대 65자리, 소수점 뒤 30자리까지 가능
			2) float/double도 사용한다.
    - 문자: varchar를 주로 사용
		* char(size): 고정 길이의 데이터 타입 생성
			=> 지정한 size의 byte 값을 가진 문자열만 가능
            => 지정된 길이보다 짧은 문자열이 입력될 경우 공백으로 채움
            => 255 바이트까지 가능
        * varchar(size): 가변 길이의 데이터 타입 생성
			=> 65535 바이트까지 가능
		* txt(n)
			1) tinytext(n)
            2) txt(n)
            3) midiumtext(n) *
            4) longtxt(n)*: varchar보다 긴 길이의 문자열을 저장할 수 있다.
				=> 크기가 매우 커 데이터 구축 시 많은 용량을 차지한다.
                => 인덱스를 지정해야 할 필요가 있음.
    - 날짜
		* date: 년/월/일
        * datetime: 년/월/일/시/분/초 => timezone까지 포함한다. ++ 추천
        * timestamp: 년/월/일/시/분/초
        * time: 시간 값만 저장

    - 바이너리 데이터: 영상, 이미지, 음원 등의 파일 데이터를 의미
		* blob: 파일의 내용을 1byte씩 쪼개 byte[(배열)]로 변경하여 저장
        * clob: 파일의 내용을 한 문자씩 쪼개 char[(배열)]로 변경하여 저장
  */
  
  /* 제약 조건
	 - 데이터베이스 안의 무결성 유지를 위해 제약을 건다.
		:결점이 없는 데이터만 추가, 수정, 삭제할 수 있어야 한다.
	 - 제약 조건의 종류
		1) not null: null 값을 허용하지 않는다.
        2) unique: 중복값을 허용하지 않는다.
				=> null 값은 비교가 불가능하므로 여러 개 저장할 수 있다.
        ------------------- => 컬럼 선언 시 작성
        3) primary key(PK): aka 기본키. 레코드 구분에 기준이 되는 식별값. null 값, 중복값을 허용하지 않는다.
			ex1) 컬럼명 데이터타입 primary key
			ex2) primary key(컬럼명, 컬럼명)
            ** primary key가 존재해야 참조할 수 있다.
            - 대체키
				ex) 컬럼명 int primary key auto_increment -- 1부터 시작, 자동으로 증가
        4) foreign key(FK): 참조키 혹은 외래키. 데이터 무결성을 위해 지정(없는 테이블 참조 차단)
							참조키를 사용하여 타 테이블 참조 표시.
							참조되는 테이블의 컬럼이 가지고 있는 값 중에서만 저장이 가능하다.
			ex) FOREIGN KEY 컬럼명 references 테이블명 (컬럼명) -- 참조 관계 형성
				-- 참조하고 있는 컬럼은 삭제가 불가능하다.
				on delete [cascade/set null] 
					-- 단, 삭제하고 싶은 경우 on delete cascade/set null 명령어를 사용
					* cascade: 참조키가 삭제된다면 참조하고 있는 데이터를 함께 삭제한다.
                    * set null: 참조키가 삭제된다면 해당 데이터의 참조키를 null로 설정한다.
                    * on update cascade: PK가 업데이트(변경)될 시 FK도 같이 변경한다.
        ------------------- => 속성 선언 후 작성
        5) check: (+ 값의 범위, 조건을 지정)해 설정한 값만 허용한다.
			ex1) gender char(1): gender를 한 개의 문자로만 표현
                 gender char(1) check (gender in ('M', 'F'))
            ex2) sal int check(sal between 1000 and 9999)
				=> sal에는 1000부터 9999까지의 값만 저장할 수 있다.
        -) default: (+값) 해당 컬럼에 값이 지정되지 않을 경우 기본값으로 대신 저장한다.
			ex1) regdate datetime default CURRENT_TIMESTAMP
				 => 기본값을 실행되고 있는 현재 시간으로 설정하여 저장한다.
			ex2) readcount int default 0
				 => 연산 시 조회수의 값이 null이면 연산이 불가능하므로 default를 이용하여 기본값을 0으로 설정한다.
  */
  
  /*
	데이터의 삽입, 수정, 삭제
    - INCERT
		incert into 테이블명(컬럼 1, 컬럼 2, ...)
        values (값 1, 값 2, ...);
        
        insert into 테이블명
        values (값 1, 값 2, ...) -- 모든 컬럼에 맞게 값 입력
    - UPDATE
		update 테이블명 set 컬럼명 = 값1, 컬럼명1 = 값2, 컬럼명 2, ...
        where 조건; -- 생략 시 모든 데이터가 변경됨.
    - DELETE
  */
  
  /*
	테이블의 복사
    create table 테이블명
	as select문;
  */