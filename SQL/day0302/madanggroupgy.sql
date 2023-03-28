#group by
select custid, count(*), sum(saleprice) -- 그룹 기준 컬럼, 집계함수만 사용 가능
from orders
group by custid; -- custid가 같은 값을 가지고 있는 레코드를 묶어줌

select custid, count(*) as 도서수량 -- 고객의 아이디와 고객별 주문 도서의 총 수량 / 집계 함수와 기준 컬럼만 사용 가능
from orders -- 주문에 따라
where saleprice >= 8000 -- 가격이 8000 이상
group by custid -- 고객의 아이디로 그룹화
having count(*) >= 2; -- 구매 도서 수량이 2 이상 / group by와 같이 쓰는 having절