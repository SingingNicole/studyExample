## 마당서점의 고객이 요구하는 다음 질문에 대해 SQL 문을 작성하시오.
	-- 박지성이 구매한 도서의 출판사 수
select count(distinct publisher)
from book
where bookid in (select bookid
				from orders
                where custid = (select custid
								from customer
                                where name like '박지성'
                ));
# 강사님 코드
select count(distinct b.publisher) -- 출판사 수
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
and c.name = '박지성';

    -- 박지성이 구매한 도서의 이름, 가격, 정가와 판매가격의 차이
select bookname, (price - saleprice) '정가와 판매가격의 차이'
from orders o inner join book b
on o.bookid = b.bookid
where o.bookid in (select bookid
				   from orders
                   where custid = (select custid
								 from customer
                                 where name like '박지성'));
# 강사님 코드
select b.bookname, b.price - o.saleprice as '정가와 판매가격의 차이'
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
and c.name = '박지성';

    -- 박지성이 구매하지 않은 도서의 이름
select bookname
from book
where bookid not in (select bookid
					 from orders
                     where custid = (select custid
									 from customer
                                     where name like "박지성"));
# 강사님 코드
select bookname
from book b1 
where not exists (select * from customer c, orders o
				  where c.custid = o.custid and o.bookid = b1.bookid
                  and c.name = '박지성' and b1.bookname = b1.bookname);
                  
select bookname from book 
where bookname not in(select bookname
					  from customer c, orders o, book b
					  where c.custid = o.custid and o.bookid = b.bookid
					  and c.name = '박지성');

## 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 SQL 문을 작성하시오.
	-- 주문하지 않은 고객의 이름(부속질의 사용)
select name
from customer
where custid not in (select custid
					 from orders);

    -- 주문 금액의 총액과 주문의 평균 금액
select sum(saleprice), avg(saleprice)
from orders;
    
    -- 고객의 이름과 고객별 구매액
select name, sum(o.saleprice)
from orders o inner join customer cs
on o.custid = cs.custid
group by name;

    -- 고객의 이름과 고객이 구매한 도서 목록
select name, book.bookname
from customer, orders, book
where customer.custid = orders.custid
and orders.bookid = book.bookid;

    -- 도서의 가격과 판매가격의 차이가 가장 많은 주문
select *
from book, orders
where book.bookid = orders.orderid
and price - saleprice = (select max(price - saleprice)
						 from book, orders
                         where book.bookid = orders.bookid);
    -- 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
select name
from customer, orders
where customer.custid = orders.custid
group by name
having avg(saleprice) > (select avg(saleprice)
						 from orders);