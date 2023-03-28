select * from customer, orders; -- 단순히 두 테이블을 붙이기만 한다/서로 연관성 없이 연결되어 조건 지정 필요함.

select * from customer, orders 
where customer.custid = orders.custid;
	/*둥가 조인: 조건식을 활용하여 연관 있는 항목끼리 연결
	  조인할 내용이 없으면 customer 항목에 있어도 출력되지 않는다.*/
      
# inner join
select *
from customer c inner join orders o -- 합칠 테이블
on c.custid = o.custid;
 -- 등가 조인 = inner join

select sum(o.saleprice) -- 중복되지 않아 그냥 사용해도 가능, 테이블 별칭 설정해도 무방
from customer c, orders o -- 테이블에 별칭을 설정할 수 있다.
where c.custid = o.custid -- 테이블 조인, 조건 1
and name = '박지성'; -- 조건 2
	-- 박지성 고객이 주문한 모든 책
    
select *
from customer c, orders o
where c.custid = o.custid
order by c.custid; -- customer 테이블의 custid 항목을 기준으로 정렬/항상 제일 마지막줄에 적기

select name, sum(saleprice)
from customer c, orders o
where c.custid = o.custid
group by c.name -- 기준 항목별 정리: group by 사용
order by c.name; -- 이름 기준 정렬

# 다수의 테이블 조인
	-- 테이블 조인에 필요한 조건의 개수 = (테이블 개수 - 1)
select *
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid;

 select *
 from customer c inner join orders o
 on c.custid = o.custid
 inner join book b
 on o.bookid = b.bookid;

# 조인이 되지 않은 데이터도 출력하기
select *
from customer c left outer join orders o
on c.custid = o.custid;

select *
from customer c right outer join orders o -- join 된 데이터만 가져온다.
on c.custid = o.custid
order by c.custid desc; -- join 조건을 on 절에 넣어준다.

select *
from customer c left outer join orders o -- join 된 데이터만 가져온다.
on c.custid = o.custid
order by c.custid desc; -- join 조건을 on 절에 넣어준다.

/*join~on
	- where 절의 조건식을 on 뒤에 작성
    - outer join
		-외부 조인: 일반적인 join 조건문으로 출력되지 않은 데이터까지 출력 가능하다.
			- right outer join: 오른쪽 열이 null인 데이터 값까지 가져온다.
			- left outer join: 왼쪽 열이 null인 데이터 값까지 가져온다.
*/

# using
select *
from customer c inner join orders o
using (custid); -- 같은 custid를 가지고 있는 데이터끼리 조인
-- 컬럼 이름이 같은 값을 공통 칼럼이라 생각하여 한 번만 출력한다.

# natural join
 -- 관계가 맺어져 있는 칼럼을 찾아 같은 값을 가지고 있는 항목을 자동으로 병합한다.alter
 select *
 from customer natural join orders;
 select *
 from customer natural join orders
 natural join book;

# 범위에 포함되는 값으로 join - between and
select * from salgrade;
select sal from emp where empno = 7788;
	-- 월급 값 출력하는 select문
select * from emp, salgrade
where sal between LOSAL and HISAL;
	-- 해당 값의 사이에 존재하는지 표시
    
select empno, MGR from emp;
select concat(e.ENAME, '의 상사는', m.ENAME, '입니다.') as "상사 정보"
from emp e, emp m where e.MGR = m.EMPNO;
	-- concat 함수: 문자열을 합쳐 준다.

select * from emp where ENAME = 'KING'