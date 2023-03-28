use madang;

#sum
select sum(saleprice) from orders;

select sum(saleprice) as 총매출 from orders;
select sum(saleprice) '총 매출' from orders;
select sum(saleprice) "Sale Price" from orders;
select bookname '책 이름', publisher 출판사, price 가격 from book;
	-- as는 생략도 가능

select sum(saleprice) as 총매출 from orders where custid = 2;

select sum(saleprice) 
as Total, avg(saleprice) as Average, min(saleprice) as Minimum, max(saleprice) 
as Maximum from orders;

#count
select count(*) from orders;
select count(*) '총 고객 수' from customer;
select count(*) '총 고객 수', count(phone) from customer;
-- select count(*), custid from customer; 서로 연관이 없는 데이터여서 오류가 난다.