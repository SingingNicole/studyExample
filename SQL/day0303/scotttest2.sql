# join을 활용하여 문제를 풀자.
select ENAME, EMPNO, JOB
from emp;

-- ANSI JOIN --
select ename, d.DEPTNO, DNAME
from emp e inner join dept d
on e.DEPTNO = d.deptno;

select ENAME, d.DEPTNO, DNAME
from emp e inner join dept d
using(DEPTNO);

select ENAME, DEPTNO, DNAME
from emp natural join dept;
-- 사원 이름과 부서번호, 부서명을 출력한다.

select e.ENAME, d.DEPTNO, d.DNAME
from dept d left outer join emp e
on d.DEPTNO = e.DEPTNO;
-- 사원이 없는 부서를 포함 사원 이름과 부서번호, 부서명을 출력한다.

select e.EMPNO, e.DEPTNO, LOC -- LOC은 중복되는 항목이 아니라 그냥 작성해도 괜찮음.
from emp e inner join dept d
where e.DEPTNO = d.DEPTNO
and ENAME = 'SCOTT';
-- 'SCOTT' 사원의 사원번호, 부서명, 근무지를 출력한다.

select e.ENAME, e.HIREDATE
from emp e inner join dept d
where e.DEPTNO = d.DEPTNO
and DNAME = 'ACCOUNTING';

select e.ENAME, date_format(HIREDATE, '%y/%m/%d') 'HIREDATE'
from emp e inner join dept d
where e.DEPTNO = d.DEPTNO
and DNAME = 'ACCOUNTING';
-- 'ACCOUNTING' 부서 소속 사원의 이름과 입사일을 출력한다.

select e.ENAME, d.DNAME
from emp e natural join dept d
where e.DEPTNO = d.DEPTNO
and COMM is not null or COMM <> 0;

select e.ENAME, d.DNAME
from emp e natural join dept d
where e.DEPTNO = d.DEPTNO
and COMM is not null;
-- 커미션을 받는 사원의 이름과 부서명을 출력한다.

select e.ENAME, e.SAL
from emp e natural join dept d
where LOC = 'NEW YORK';
-- 'NEW YORK'에서 근무하는 사원의 이름과 급여를 출력한다.

select f.ENAME
from emp m, emp f
where m.DEPTNO = f.DEPTNO
and m.ENAME = 'SCOTT' and f.ENAME <> 'SCOTT';
-- 'SCOTT'과 동일한 부서에서 근무하는 사원의 이름들을 출력한다

select EMPNO, DNAME, JOB, GRADE
from emp e inner join dept d
on e.DEPTNO = d.DEPTNO
inner join salgrade
on e.SAL between LOSAL and HISAL
where ENAME = 'SCOTT';
-- inner join을 사용, 'SCOTT'의 사원번호, 부서명, 급여 등급 출력