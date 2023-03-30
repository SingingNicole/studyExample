# delete 연습
delete from book
where bookid = 11;
select * from book;

delete from customer; -- Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`madang`.`orders`, CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`custid`) REFERENCES `customer` (`custid`))
-- 외부키로 참조하고 있어 삭제 불가능. on delete나 on update가 없어 수정이나 삭제가 불가능하다.

delete from test; -- 제약 조건이 없어 삭제가 가능.
select * from test;
select count(*) from test;
-- truncate의 기능과 유사하나 truncate는 롤백이 불가능하다는 점이 다르다.