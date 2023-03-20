select * from book;
	-- book 테이블에 있는 모든 데이터(*)를 출력
    -- 모든 도서의 이름과 가격을 검색하시오.
select bookname, price from book;
	-- 여러 개의 colum을 가져 올 때는 ,사용
select price, bookname from book;
	-- 데이터의 출력 순서를 바꿀 수도 있다.
select publisher from book;

select distinct publisher from book;
	# distinct 명령어: 중복값을 제거한다.
    -- all은 굳이 사용하지 않음.
select distinct bookname, publisher from book;
	-- bookname과 publisher가 동시에 중복되는 항목은 제거하고 출력한다.
select distinct publisher, bookname from book;
	-- 순서를 바꾸어도 똑같이 출력된다.
    
select * from book where true;
select * from book where 1 = 1;
	-- true, false를 직접 적지 않고 수식으로 표현하기도 한다.
select * from book where false;
select * from book where 1 = 0;
	-- where 뒤 절이 false일 경우 출력하지 않는다.

# select bookname, distinct publisher from book; => 오류 식
	-- distinct 명령어를 중간에 사용하는 것은 불가능하다.
    
select * from book where price < 20000;

select * from book where price between 10000 and 20000;
select * from book where price >= 10000 and price <= 20000;
	-- where 컬럼명 between 시작값 and 끝값;
    
select * from orders where orderdate between '14-07-05' and '14-07-07';
	# 날짜 데이터의 경우 '년-월-일' 혹은 '년/월/일'로 표기한다.
    
select * from customer where name between '김' and '추';
	-- 문자 데이터 역시 '(문자)'로 표기한다.
    
select * from book where price >= 10000 and publisher = '나무수';
	-- 하나의 컬럼의 범위 내라면 숫자, 문자를 상관 없이 구분한다.

select * from book where publisher = '굿스포츠' or publisher = '대한미디어';
select * from book where publisher in ('굿스포츠', '대한미디어');
    -- where 열 이름 in (데이터1, 데이터2, ... 데이터 n); => 열 이름에서 데이터 n의 값을 포함한 목록을 모두 출력한다.

select * from book where publisher not in ('굿스포츠', '대한미디어');
	-- not in의 경우 해당 조건이 아닌 데이터를 출력한다.

select * from book where bookname = '올림픽 이야기';
select * from book where bookname like '올림픽 이야기';
select bookname, publisher from book where bookname like '%축구%';
	# like + '%(문자)%': 해당 문자가 포함되어 있으면 모두 출력한다.
    -- _: 어떤 값이든 상관 없이 한 개의 문자 데이터를 의미
    -- %: 길이와 상관 없이(문자 없는 경우도 포함) 모든 문자 데이터 의미
    -- ex)'_AB' => 첫 번째 문자와 상관 없이(문자 값이 있어야 함) 세 개의 문자로 이루어진 단어 중 두 번째 문자가 A, 세 번째 문자가 B인 데이터
    -- ex) 's%' => s로 시작하는 모든 문자열(s만 존재해도 가능)
    -- ex) '%A' => A로 끝나는 모든 문자열(A만 존재해도 가능)
    -- ex) '%B%' => B를 포함하는 모든 문자열(B만 존재해도 가능)
select * from customer where name like '박%';
	-- 성이 '박'인 모든 고객의 정보 출력
select bookname, price from book where bookname like '_구%';
	-- 책 이름이 'x구'로 시작하는 모든 책의 책 이름과 가격 출력
select * from book where bookname like '%축구%' and price >= 20000;
	-- 책 이름에 '축구'가 포함되고 가격이 20000인 모든 책의 정보 출력