# 실습 9-1: 사원 이름이 JONES인 사원의 급여 출력하기
select SAL
from emp
where ENAME = 'JONES';

# 실습 9-2: 급여가 2975보다 높은 사원 출력하기
select * 
from emp
where SAL > 2975;

# 실습 9-3: 서브쿼리로 JONES의 급여보다 높은 급여를 받는 사원 정보 출력하기
select *
from emp
where SAL > (select SAL
			 from emp
             where ENAME = 'JONES');

# 실습 9-4: 서브쿼리의 결과 값이 날짜형인 경우
select *
from emp
where HIREDATE < (select HIREDATE
				  from emp
                  where ENAME = 'SCOTT'); -- scott보다 hiredate가 빠른 경우

# 실습 9-5: 서브쿼리 안에서 함수를 사용한 경우
select E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DEPTNO
from emp E, dept D
where E.DEPTNO = D.DEPTNO
and E.DEPTNO = 20
and E.SAL > (select avg(SAL)
			 from emp); -- SAL이 평균값 이상이고 DEPTNO가 20인 사원

# 실습 9-6: in 연산자 사용
select *
from emp
where DEPTNO in (20, 30); -- DEPTNO의 값이 20이거나 30인 emp 테이블의 정보를 출력

# 실습 9-7: 각 부서별 최고 급여와 동일한 급여를 받는 사원 정보 출력하기
select *
from emp
where SAL in (select max(SAL)
			  from emp
              group by DEPTNO);

# 실습 9-8: 부서 번호 별로 최대 급여 출력하기
select max(SAL)
from emp
group by DEPTNO;

# 실습 9-9: any 연산자 사용하기
select * 
from emp 
where SAL = any(select max(SAL)
				from emp
				group by DEPTNO);
	-- any 연산자 역시 = 기호와 사용했을 때 in과 같은 역할을 한다.
    -- 조건을 하나만 만족해도 true 반환
    
# 실습 9-10: some 연산자 사용하기
select * 
from emp
where SAL = some(select max(SAL)
				 from emp
                 group by DEPTNO);
	 -- any, in과 같은 기능을 한다.
     
# 실습 9-11: 30번 부서 사원들의 최대 급여보다 적은 급여를 받는 사원 정보 출력하기
select *
from emp
where SAL < any (select SAL -- 서브쿼리 결과 값 중 급여의 최댓값보다 작은 값을 모두 출력 대상으로 삼는다.
				 from emp
                 where DEPTNO = 30)
order by SAL, DEPTNO;

select *
from emp
where sal < (select max(SAL) -- any 연산자와 max 함수를 사용하여 같은 결과를 낼 수 있음.
			 from emp
			 where DEPTNO = 30)
order by SAL, EMPNO;

# 실습 9-13: 30번 부서 사원들의 최소 급여보다 많은 급여를 받는 사원 정보 출력하기
select *
from emp
where SAL > any (select SAL
				 from emp
                 where DEPTNO = 30);

# 실습 9-14: 부서 번호가 30번인 사원들의 최소 급여보다 더 적은 급여를 받는 사원 출력하기
select * 
from emp
where SAL < all(select SAL
				from emp
                where DEPTNO = 30);
