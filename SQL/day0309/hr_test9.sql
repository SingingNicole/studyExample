#  A.9 다차원 그룹 데이터 검색 : ROLLUP 

/*
  문제] HR 부서에서는 부서와 업무별 급여 합계를 구하여 신년도 급여 수준 레벨을 지정하고자 한다.
  부서번호와 업무를 기준으로 전체 행을 그룹별로 나누어 급여 합계와 인원수를 출력하시오(20행).
 */
select department_id, job_id, sum(salary) as 'sumSalary',
       count(employee_id) as 'countEmp'
from employees
group by department_id, job_id with rollup; -- rollup: 그룹에 대한 집계

-- grouping 사용하기
select department_id, job_id, sum(salary) as 'sumSalary',
       count(employee_id) as 'countEmp',
grouping(department_id), grouping(job_id)
-- 0으로 출력되었다면 해당 컬럼으로 그루핑 되어 있는 데이터라는 의미이다.
from employees
group by department_id, job_id with rollup; -- rollup: 그룹에 대한 집계

/*
  [문제 1] 위 문제의 결과를 근거로 부서에 대한 집계 결과가 아니면 (ALL-DEPTS) 라고 출력하고,
  업무에 대한 집계 결과가 아니면 (ALL-JOBS)라고 출력하며, 
  해당 집계에 대한 사원수와 평균연봉을 구하시오(33행).
  ROLLUP, GROUPING 함수를 사용한다. 
 */
select department_id, job_id,
	case when grouping(department_id) = 1 then 'ALL-DEPTS'
		else department_id
	end department_id, 
	case when grouping(job_id) = 1 then 'ALL-JOBS'
		else job_id
	end job_id,
		sum(salary) as 'sumSalary',
		count(employee_id) as 'countEmp'
from employees
group by department_id, job_id with rollup;