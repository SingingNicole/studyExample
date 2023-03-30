# 중첩질의 - where 부속질의
	-- 부속질의가 반드시! 단일 행, 단일 열을 반환해야 한다.

## 질의 4-15) 평균 주문금액 이하의 주문에 대해서 주문번호와 금액을 보이시오.
select orderid, saleprice
from orders
where saleprice <= (select avg(saleprice)
					from orders); -- 비상관질의
                    
## 질의 4-16) 각 고객의 평균 주문금액보다 큰 금액의 주문 내역에 대해서 주문번호, 고객번호, 금액을 보이시오
select orderid, custid, saleprice
from orders od
where saleprice > (select avg(saleprice)
				   from orders so
                   where od.custid = so.custid); -- 상관질의
	-- 가지고 있는 값이 평균 주문금액보다 큰지 관계를 비교한다.
    
# in/not in: 질의 속성이 집합에 있는지 확인
## 질의 4-17 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오.
select sum(saleprice) as 'total'
from orders
where custid in (select custid
				 from customer
                 where address like '%대한민국%');

# all/some(any): 최소한 하나라도 포함하고 있다면 true
## 질의 4-18: 3번 고객이 주문한 도서의 최고 금액보다 더 비싼 도서를 구입한 주문의 주문 정보를 출력.
select *
from orders
where saleprice > all(select saleprice
					  from orders
					  where custid = 3);
                      
select ENAME, SAL
from emp
where SAL > any(select SAL
				from emp
			    where DEPTNO = 30);

	-- 하나라도 true인 값: any
    -- 전부 다 true인 값: all
    -- 임을 활용하여 조건식을 작성할 수 있다.
    
# exist, not exist: 데이터의 존재 유무 확인/ 존재하면 참
## 질의 4-19 exist 연산자로 대한민국에 거주하는 고객에게 판매한 도서의 총 판매액을 구하시오
select sum(saleprice) as 'total'
from orders od
where exists (select * 
			  from customer cs
              where address like '%대한민국%' and cs.custid = od.custid);