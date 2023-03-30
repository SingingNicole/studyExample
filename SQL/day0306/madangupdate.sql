# update 연습
update customer
set address = '대한민국 부산'
where custid = 5;
select * from customer;

update test
set name = 'database'; -- 조건을 지정하지 않아 name의 값이 모두 database로 변경됨.
select * from test;

create table nwcustomer
as select * from customer;
select * from nwcustomer; -- 복제된 테이블

update nwcustomer
set address = '대한민국 서울'; -- 모든 nwcustomer 테이블의 주소가 대한민국 서울로 변경
select * from nwcustomer;

update book
set publisher = (select publisher
				 from imported_book
                 where bookid = '21')
where bookid = '14';
select * from book;
