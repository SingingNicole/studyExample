# 12 - 6 EMP 테이블을 복사하여 EMP_ALTER 테이블 생성하기
create table emp_ALTER
as select * from emp;

select * from emp_ALTER;

# 12 - 7 ALTER 명령어로 HP 열 추가하기
alter table emp_ALTER
add HP varchar(20);

select * from emp_alter;