# 마당서점의 고객이 요구하는 다음 질문에 대해 sql 문을 작성하시오.
select bookname from book where bookid = 1;
	-- 도서번호가 1인 도서의 이름
select bookname from book where price >= 20000;
    -- 가격이 20000원 이상인 도서의 이름
select sum(saleprice) from orders where custid = 1;
    -- 박지성의 총 구매액
select count(*) from orders where custid = 1;
	-- 박지성이 구매한 도서의 수
    
# 마당서점의 운영자와 경영자가 요구하는 다음 질문에 대해 sql 문을 작성하시오.
select count(*) from book;
	-- 마당서점 도서의 총 개수
select count(distinct publisher) as "총 출판사 수" from book;
    -- 마당서점에 도서를 출간하는 출판사의 총 개수
select name, address from customer;
    -- 모든 고객의 이름, 주소
select orderid from orders where orderdate between '2014-07-04' and '2014-07-07';
    -- 2014년 7월 4일, 7월 7일 사이에 주문 받은 도서의 주문번호
select orderid from orders where orderdate not between '2014-07-04' and '2014-07-07';
    -- 2014년 7월 4일, 7월 7일 사이에 주문 받은 도서를 제외한 도서의 주문번호
select name, address from customer where name like '김%';
    -- 성이 김씨인 고객의 이름과 주소
select name, address from customer where name like '김%아';
    -- 성이 김씨이고 이름이 아로 끝나는 고객의 이름과 주소