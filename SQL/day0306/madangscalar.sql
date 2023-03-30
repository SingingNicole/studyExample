# 스칼라 부속질의
select custid, sum(saleprice) as 'total'
from orders od
group by custid;

select (select name
		from customer cs
        where cs.custid = od.custid) as 'name',
        sum(saleprice) as 'total'
from orders od
group by od.custid;

alter table orders add bname varchar(40);

update orders
set bname = (select bname
			 from book
			 where book.bookid = orders.bookid);
             
# 인라인 뷰 - from 절에서 사용되는 부속질의
	-- 가상의 테이블, 다중행/다중열 허용
    -- 상관 부속질의로는 사용될 수 없다.
select cs.name, sum(od.saleprice) as 'total'
from (select custid, name
	  from customer
      where custid <= 2) as cs, orders od
where cs.custid = od.custid
group by cs.name;