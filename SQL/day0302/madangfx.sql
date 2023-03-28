# 숫자 함수
select abs(-78), abs(78) from dual; -- 더미데이터를 한 줄 가지고 있는 테이블
	-- dual: 가상테이블

select abs(-78), abs(78) from customer; -- customer의 모든 레코드를 꺼내 옴/5번 출력
select abs(-78), abs(78) from book; -- 10번 실행

select * from dual;

select round(654.876, 1); -- 소숫점 n번째 자리에서 올림 처리: 해당 식은 1번쩨 자리서 반올림
select round(654.876, -2);

select 10000 + 10000;
select sal, sal - 100 from emp;

select '10000' + '10000';
select '10,000' + '10,000'; -- ,를 숫자로 바꿀 수 없어 20이 출력된다.

# 고객별 평균 주문 금액을 백 원 단위로 반올림한 값을 구하시오.
select custid, round(avg(saleprice), -2) -- 평균 주문 금액
from orders
group by custid;

# 문자열 함수
select lpad(bookname, 15, ' ') from book; -- 정렬 처리가 필요할 때 사용함
select rpad(bookname, 15, ' ') from book;

select bookid, replace(bookname, '야구', '농구') bookname, publisher, price
from book; -- replace: 문자열 대체

select bookname '제목', char_length(bookname) '문자수', length(bookname) '바이트수'
from book
where publisher = '굿스포츠';
-- char_length: 문자의 개수를 구함
-- lenght: 문자의 바이트수를 구함

select substr('database', 1, 4);
select substr('database', 5);
 -- 입력한 정수 인덱스에 해당하는 문자를 출력
 
select instr('database', 'a'); -- 특정 문자열 데이터가 어느 위치에서 처음 등장하는지 찾는다.
	-- 없는 문자열은 0으로 나타남 / 문자열이 있는지 없는지 체크하는 용도로 활용 가능
    
select substr(name, 1, 1) '성', count(*) '인원'
from customer
group by substr(name, 1, 1);
-- customer 콜럼에 포함되어 있는 이름 중 첫 글자가 같은 인원을 구할 수 있다.

# 날짜 함수
select now();
select sysdate();
select current_date();
select current_time();
select current_timestamp();
-- 현재 시간을 제공하는 함수를 이용하여 프로그램 실행 시간을 알아볼 수 있다.

select orderid '주문번호', orderdate '주문일', adddate(orderdate, interval 10 day) '확정'
from orders;
-- 특정 날짜에서 일정 기간 지난 날짜를 구할 수 있다.
select orderid '주문번호', orderdate '주문일', adddate(orderdate, interval 10 month) '확정'
from orders;

select curdate() + 10; -- 현재 날짜에 10일을 더하여 출력한다.
	-- 음수로 계산할 경우 오류가 발생하므로 주의

select orderid, custid, bookid,
date_format(orderdate, '%y년 %m월 %d일') 주문일
from orders
where orderdate = str_to_date('2014년 7월 7일', '%Y년 %m월 %d일');
-- 2014년 7월 7일 받은 주문만 출력한다.

desc orders; -- 데이터 필드의 타입을 조회 가능

select sysdate(),
date_format(sysdate(), '%Y/%m/%d %M %h:%s') 'SYSDATE_1';

select * from customer where phone = null; -- phone이라는 데이터 레코드가 null인 값이 존재하지 않는다.
select * from customer; -- 전부 출력시 phone이 null인 데이터 값이 보이기는 한다.
	-- null값은 연산자로 비교하는 것이 불가능하여 찾을 수 없다.
    -- 빈 문자열(''), 공백(' ')과 0과 null은 다르다.
		-- null: 미정인 값
    
# null 값의 비교와 연산: is null, is not null/ifnull
select * from customer where phone is null;
	-- phone의 값이 null인지 비교하여 출력
select * from customer where phone is not null;
	-- phone의 값이 null이 아닌지 비교하여 출력

select name '이름', ifnull(phone, '연락처 없음') '전화번호' -- null의 값을 '연락처 없음'이라는 문자열로 대체한다.
from customer;

select ename, sal, comm from emp;
select ename, sal * 12 + comm as 연봉 from emp;

set @seq:=0;
select (@seq:=@seq+1) '순번', custid, name, phone
from customer
where @seq < 2;