#autoincrement
create table test(
id int primary key auto_increment,
name varchar(10) not null,
birth datetime default current_timestamp
);

insert into test(name) -- PK가 자동으로 하나씩 증가, birth의 값은 default 값이 존재하므로 입력하지 않아도 오류가 나지 않는다.
values ("javakim"); -- name 하나의 값만 입력해도 가능.
select * from test;

insert into test(name, birth)
values ("mysql", '2000/01/01'); -- 년/월/일만 입력하여 경고창 생성
select * from test;