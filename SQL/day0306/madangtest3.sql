-- book 테이블을 복제한 nwbook 테이블을 생성하고 실행하세요.
create table nwbook
as select * from book;

# 다음 질의에 대해 DML 문을 작성하시오.
-- (1) 새로운 도서 (‘스포츠 세계’, ‘대한미디어’, 10000원)이 마당서점에 입고되었다. 
	-- 삽입이 안 될 경우 필요한 데이터가 더 있는지 찾아보자.
insert into nwbook
	   values (24, '스포츠 세계', '대한미디어', 10000);
select * from nwbook;
-- (2) ‘삼성당’에서 출판한 도서를 삭제해야 한다.
delete from nwbook
where publisher = '삼성당';
select * from nwbook;
-- (3) ‘이상미디어’에서 출판한 도서를 삭제해야 한다. 삭제가 안 될 경우 원인을 생각해보자.
delete from nwbook
where publisher = '이상미디어';
select * from nwbook;
-- (4) 출판사 ‘대한미디어’가 ‘대한출판사’로 이름을 바꾸었다.
update nwbook
set publisher = '대한출판사'
where publisher like '대한미디어';
select * from nwbook;

## 마당서점에서 다음의 심화된 질문에 대해 SQL 문을 작성하시오.
  -- (1) 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
select name
from customer c, orders o, book b
where c.custid = o.orderid and o.bookid = b.bookid
and publisher in (select publisher
				from customer c2 inner join orders o2
                on c2.custid = o2. custid
                where c2.custid = o2.custid
                and c2.name = '박지성')
and name <> '박지성';
  -- (2) 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름
select name
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid;

select name, count(distinct publisher) >= 2
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
group by name;
                
select name from customer c1
where 2 <= (select count(distinct publisher)
			from orders o, book b
			where o.bookid = b.bookid
			and c1.custid = custid);

  -- (3) (생략) 전체 고객의 30% 이상이 구매한 도서 
select bookname
from book b1
where ((select count(*)
		from book, orders
        where book.bookid = orders.bookid
        and b1.bookid = book.bookid
        ) >= 0.3 * (select count(*) from customer)
        );