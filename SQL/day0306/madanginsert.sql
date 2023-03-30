# insert 연습
insert into book(bookid, bookname, publisher, price)
			values(11, '스포츠 의학', '한솔의학서적', 90000);
select * from book where bookid = 11;

insert into book(bookid, bookname, publisher, price)
			values(11, '스포츠 의학', '한솔의학서적'); -- error code 1136: colum count doesn't match value count at low 1

insert into book(bookid, bookname, publisher, price)
			values(11, '스포츠 의학', '한솔의학서적', '구만원'); -- Error Code: 1366. Incorrect integer value: '구만원' for column 'price' at row 1

insert into book(bookid, bookname, publisher, price)
			values(11, '오라클로 배우는 데이터베이스 입문', '이지스퍼블리싱', '25000'); -- Error Code: 1062. Duplicate entry '11' for key 'book.PRIMARY'

insert into book(bookid, bookname, publisher)
			values(12, '스포츠 의학', '한솔의학서적');
select * from book where bookid in (11, 12);

insert into book(bookid, bookname, publisher, price)
			values(13, '스포츠 의학', '한솔의학서적', null);
select * from book where bookid in (11, 12, 13);

insert into book -- 컬럼명을 생략 가능/컬럼에 들어가는 값은 모두 입력해야 한다.
values(14, '수학의 정석', '성지출판', 30000);
select * from book where bookid in (14);

insert into book
values(15, '수학의 정석', '성지출판'); -- Error Code: 1136. Column count doesn't match value count at row 1

insert into book
values(15, '수학의 정석', '성지출판', null);
select * from book where bookid in (15);

insert into book(bookid, bookname, price, publisher) -- 생략 가능
			select imported_bookbookid, bookname, price, publisher
            from Imported_Book;
select *
from book
order by bookid desc;

insert into book
select * from imported_book;
select * from book order by bookid desc;

create table new_book1
as select * from book;

select * from new_book1; -- 테이블 복사

create table new_book2
as select * from book where bookname like '축구%';
select * from new_book2;

create table new_book3
as select bookname, publisher from book;
select * from new_book3;

create table new_book4
as select * from book where 1 = 0; -- 내용이 없는 스키마만 복사됨

insert into new_book4
select * from book where bookname like '%야구%';
select * from new_book4; -- 특정 레코드만 뽑아 생성된 테이블에 데이터 입력 가능