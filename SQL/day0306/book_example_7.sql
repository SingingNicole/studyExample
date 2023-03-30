# 실습 7-20: group by 절과 having 절을 사용하여 출력하기
select DEPTNO, JOB, avg(SAL)
from emp
group by DEPTNO, JOB
having avg(SAL) >= 2000 -- having 절로 group by의 조건을 제한한다.
order by DEPTNO, JOB;

# 실습 7-21: having절 대신 where절을 잘못 사용했을 경우
select DEPTNO, JOB, avg(SAL)
from emp
where avg(SAL) >= 2000
group by DEPTNO, JOB
order by DEPTNO, JOB; -- Error Code: 1111. Invalid use of group function

# 실습 7-22 where 절을 사용하지 않고 having절만 사용한 경우
select DEPTNO, JOB, avg(SAL)
from emp
group by DEPTNO, JOB
having avg(SAL) >= 2000
order by DEPTNO, JOB;

# 실습 7-23: where절과 having 절을 모두 사용한 경우
select DEPTNO, JOB, avg(SAL)
from emp
where SAL <= 3000
group by DEPTNO, JOB
having avg(SAL) >= 2000
order by DEPTNO, JOB;
-- where절이 group by절, having절보다 먼저 실행되므로 10번 부서의 rpesident 데이터가 출력되지 않는다.
-- where절에 해당하지 않는 데이터는 그룹화의 대상으로 들어갈 수 없다.