# trigger 연습
-- 1) product 테이블을 생성
create table product(
code char(6) primary key,
name varchar(12) not null,
company varchar(12),
price int,
quantity int default 0
);

-- 2)warehousing 테이블을 생성
 # drop table warehousing;
create table warehousing(
no int primary key,
code char(6) references product(code),
w_date date default (current_date),
w_quantity int,
unit_cost int,
w_price int
);

-- 3) product테이블의 w_quantity 컬럼을 통해서 실질적인 트리거의 적용 예를 살펴보도록 하겠다.
   -- 우선 product 테이블에 다음과 같은 샘플 데이터를 입력해 보자.
insert into product(code, name, company, price) values ('A00001', '세탁기', 'LG', 500);
insert into product(code, name, company, price) values ('A00002', '컴퓨터', 'LG', 700);
insert into product(code, name, company, price) values ('A00003', '냉장고', '삼성', 600);

-- 4) warehousing 테이블에 product이 입력되면 warehousing 수량을 product 테이블의 quantity에 추가하는 트리거 작성
-- warehouse 트리거
	# drop trigger trg_01;
delimiter //
create trigger trg_01
after insert on warehousing for each row
begin
update product
set quantity = quantity + new.w_quantity
where code = new.code;
end;
//
delimiter ;

-- 5) 트리거를 실행시킨 후 warehousing 테이블에 행을 추가한다. warehousing 테이블에는 물론 product 테이블의 quantity가 변경됨을 확인할 수 있다.
insert into warehousing(no, code, w_quantity, unit_cost, w_price) values (1, 'A00001', 5, 320, 1600);
select * from warehousing;
select * from product;

-- 6) warehousing 테이블에 product이 입력되면 자동으로 product 테이블의 quantity이 증가하게 된다. warehousing 테이블에 또 다른 product을 입력한다. 
insert into warehousing(no, code, w_quantity, unit_cost, w_price) values (2, 'A00002', 10, 680, 6800);
select * from warehousing;
select * from product;

insert into warehousing(no, code, w_quantity, unit_cost, w_price) values (3, 'A00003', 10, 220, 2200);
select * from warehousing;
select * from product;

# <실습하기> 갱신 트리거 작성하기
-- 이미 warehousing된 product에 대해서 warehousing 수량이 변경되면 product 테이블의 w_quantity 역시 변경되어야 한다. 이를 위한 갱신 트리거 작성해 보자. 
-- 갱신 트리거
	# drop trigger trg02;
delimiter //
create trigger trg02
after update on warehousing for each row
begin
update product
set quantity = quantity + (-old.w_quantity + new.w_quantity)
where code = new.code;
end;
//
delimiter ;

-- 2) warehousing 번호 3번은 냉장고가 warehousing된 정보를 기록한 것으로서 warehousing 번호 3번의 w_quantity을 8로 변경하였더니 냉장고의 quantity 역시 8로 변경되었다.
update warehousing set w_quantity = 8, w_price = 2200
where no = 3;

select * from warehousing order by no;

# <실습하기> 삭제 트리거 작성하기
-- warehousing 테이블에서 warehousing되었던 상황이 삭제되면 product 테이블에 w_quantity에서 삭제된 w_quantity 만큼을 빼는 삭제 트리거 작성해 보자. 
-- 삭제 트리거
delimiter //
create trigger trg3
after delete on warehousing for each row
begin
update product
set quantity = quantity - old.w_quantity where code = old.code;
end;
//
delimiter ;

-- 2) 입고번호 3번은 냉장고가 입고된 정보를 기록한 것으로서 입고번호가 3번인 행을 삭제하였더니 냉장고의 수량 역시 0으로 변경되었다. 
delete from warehousing where no = 3;
select * from warehousing order by no;
select * from product;