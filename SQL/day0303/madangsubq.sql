# 서브쿼리(부속질의)
select bookname
from book
where price = (select max(price) from book);
-- 서브쿼리

-- 'SCOTT'과 동일한 부서에 근무하는 사원의 이름?
select ENAME
from emp
where (select DEPTNO from emp where ENAME = 'SCOTT')
and ename <> 'SCOTT';

select name
from customer
where custid in (select distinct custid from orders);
-- 다중행 서브쿼리: 서브쿼리의 결과물이 여러 개일 경우 in 명령어를 사용한다.

/*서브쿼리의 조건문 작성은 서브쿼리로 나오는 결과값이 몇 개인가에 따라 달라진다.
	1. 서브쿼리의 결과물이 하나일 경우 equals 혹은 비교 연산자를 사용한다.
	2. 결과물이 여러 개일 경우 in을 사용한다. 
*/

select name
from customer
where custid in (select custid 
				 from orders 
				 where bookid in (select bookid 
								  from book 
								  where publisher = '대한미디어'));
-- 대한미디어에서 출판한 도서를 구매한 고객의 이름

select b1.bookname
from book b1
where b1.price > (select avg(b2.price) -- 평균값보다 큰 도서를 구함
				  from book b2
                  where b2.publisher = b1.publisher); -- 특정 출판사의 책을 모두 추출한 후 가격의 평균 구함
-- 출판사별로 출판사의 평균 도서 가격보다 비싼 도서 구하기

# 서브쿼리 함수 EXIST: 조건에 맞는 레코드가 존재하면 true, 없으면 false
	-- 존재 여부를 체크할 수 있다.
select name, address
from customer cs
where exists (select * 
			  from orders od 
			  where cs.custid = od.custid);