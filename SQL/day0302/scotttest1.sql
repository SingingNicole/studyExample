select * from dept;
-- 모든 부서의 정보 출력
select ENAME, SAL, HIREDATE from emp;
-- 사원의 이름과 급여, 입사일자만 출력
select distinct JOB from emp;
-- 사원의 직급은 어떤 것들이 있는지 출력(중복X)
select * from emp where SAL >= 3000;
-- 급여를 3000 이상 받는 사원의 정보 출력
select * from emp where DEPTNO = 10;
-- 부서번호가 10번인 사원 정보 출력
select EMPNO, ENAME, SAL from emp where SAL < 2000;
-- 급여가 2000 미만인 사원의 사번, 이름, 급여 출력
select EMPNO, JOB, ENAME from emp where ENAME = 'MILLER';
-- 이름이 'MILLER'인 사원의 사원번호와 직급, 이름 출력
select * from emp where HIREDATE >= '1981-01-01';
-- 입사일이 81년 이후인 사원정보 출력
select ENAME, JOB, DEPTNO from emp where DEPTNO = 10 and JOB = 'MANAGER';
-- 10번 부서의 직급이 'MANAGER'인 사원의 이름, 직급, 부서번호 출력
select EMPNO, ENAME from emp where EMPNO in (8744, 7654, 7521);
-- 사원번호가 8744이거나 7654이거나 7521인 사원의 사원번호, 이름 출력
select * from emp where DEPTNO != 10;
-- 10번 부서에 속하지 않은 사원의 정보 출력
-- 아니다: <>(DEPTNO <> 10 => 10이 아니다)
select ENAME, EMPNO from emp where ENAME like '%K%';
-- 이름에 'K'가 들어간 사원의 이름과 사번 출력
select ENAME, EMPNO from emp where ENAME not like '%A%';
-- 이름에 'A'가 없는 사원의 이름과 사번 출력
select EMPNO, ENAME, HIREDATE from emp order by HIREDATE desc;
-- 입사일이 가장 최근인 사원순으로 사번, 이름, 입사일 출력
select EMPNO, ENAME, HIREDATE from emp order by HIREDATE limit 1;
-- 입사가 가장 빠른 사원의 사번, 이름, 입사일 출력