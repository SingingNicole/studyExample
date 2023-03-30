create table member(
no int primary key auto_increment,
name char(5) not null,
userid varchar(15) unique not null,
password varchar(15) not null,
age int(3) default null,
email varchar(30) default null,
address varchar(50) default null
);

insert into member(name, userid, password, age, email, address) values('유재석', 'you', '1234', 47, 'you@naver.com', '서울시 서초구 방배2동');
insert into member(name, userid, password, age, email, address) values('모모', 'momo', 'abcd', null, 'momo@daum.net', '경기도 성남시 태평3동');
insert into member(name, userid, password, age, email, address) values('박나라', 'park', 'test01', 32, 'nara@google.com', '인천시 연수구 청학동');
insert into member(name, userid, password, age, email, address) values('토르', 'thor', 'ok005', 36, null, '서울시 중랑구 상봉동 99');
insert into member(name, userid, password, age, email, address) values('박명수', 'park2', 'sky3', 49, 'great4@apple.com', '서울시 마포구 망원동');
insert into member(name, userid, password, age, email, address) values('유병재', 'you2', 'apple', 32, 'bjae@daum.net', '');
insert into member(name, userid, password, age, email, address) values('스타크', 'stark', 'rich', 54, 'tony@start.com', '대전시 유성구 구성동');

commit;

select * from member;

update member
set email = 'thor2@naver.com'
where name = '토르';

update member
set address = '경기도 용인시 기흥동'
where userid = 'you2';

delete from member where no = 7;

update member
set age = 21
where userid = 'momo';

select *
from member
where age between 30 and 39;

select *
from member
where address like '%서울시%';

select *
from member
where email like '%@daum%';

select *
from member
order by name;

select *
from member
order by age desc, name;