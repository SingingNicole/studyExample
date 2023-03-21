# A.1 데이터 검색 : SELECT

-- [문제] 사원정보(EMPLOYEE) 테이블에서 사원번호, 이름, 급여, 업무, 입사일, 상사의 사원번호를 출력하시오.
-- 이때 이름은 성과 이름을 연결하여 Name이라는 별칭으로 출력하시오(107 행). 
select employee_id, concat(first_name, ' ' ,last_name) as 'Name', salary, job_title, hire_date, manager_id
from employees inner join jobs
on employees.job_id = jobs.job_id;

-- [문제 1] 사원정보(EMPLOYEES) 테이블에서 사원의 성과 이름은 Name, 업무는 Job, 급여는 Salary,
-- 연봉에 $100 보너스를 추가하여 계산한 값은 Increased Ann_Salary,
-- 급여에 $100 보너스를 추가하여 계산한 연봉은 “Increased Salary”라는 별칭으로 출력하시오(107행). 
select concat(first_name, ' ' ,last_name) as 'Name', job_title as 'job', 
	   salary, salary * 12 + 100 as 'Increased Ann_Salary', (salary + 100) * 12 as 'Increased Salary'
from employees inner join jobs
on employees.job_id = jobs.job_id;

-- [문제 2] 사원정보(EMPLOYEE) 테이블에서 모든 사원의 이름(last_name)과 연봉을 “이름: 1 Year Salary = $연봉” 형식으로 출력하고, “1 Year Salary”라는 별칭을 붙여 출력하시오(107 행).
select concat('이름: ', last_name, ' ' , '1 Year salary = ', (salary * 12)) as '1 Year Salary'
from employees;

-- [문제 3] 부서별로 담당하는 업무를 한 번씩만 출력하시오(20행)
select distinct job_title
from jobs;