# 집합 연산자 UNION, UNION ALL
select name from customer where address like '대한민국%' -- 3
union -- 각 select 절의 결과를 합친다.
select name from customer
where custid in (select custid
				 from orders); -- 4
-- 대한민국에서 거주하는 고객의 이름과(and) 도서를 주문한 고객의 이름
	-- union all의 경우 중복값까지 출력한다.
    -- colum의 개수가 다를 경우 합쳐지지 않는다.
    
# 집합 연산자 IN, NOT IN: 차집합, 교집합 연산자
select name
from customer
where address like '대한민국%' and
	  name NOT IN (select name
				   from customer
                   where custid IN (select custid from orders));
	-- 대한민국에서 거주하는 고객의 이름에서 도서를 주문한 고객의 이름을 제외하고 출력

select name
from customer
where address like '대한민국%' and
		name IN (select name
				 from customer
				 where custid IN(select custid from orders));
	-- 대한민국에서 거주하는 고객 중 도서를 주문한 고객의 이름을 출력