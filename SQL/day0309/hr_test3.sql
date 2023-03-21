 # A.3 단일 행 함수 및 변환 함수 
 /*
   [문제] 이번 분기에 60번 IT 부서에서는 신규 프로그램을 개발하고 보급하여 회사에 공헌하였다. 이에 해당 부서의 사원 급여를 12.3% 인상하기로 하였다.
   60번 IT 부서 사원의 급여를 12.3% 인상하여 정수만(반올림) 표시하는 보고서를 작성하시오.
   출력 형식은 사번, 이름과 성(Name으로 별칭), 급여, 인상된 급여(Increased Salary로 별칭)순으로 출력한다(5행). 
  */
select employee_id, concat(first_name, ' ', last_name) as 'Name', salary, 
       round((salary * 1.123), 0) as 'Increased Salary'
from employees
where department_id = 60;
  
/*
   [문제 1] 각 이름이 ‘s’로 끝나는 사원들의 이름과 업무를 아래의 예와 같이 출력하고자 한다.
   출력 시 성과 이름은 첫 글자가 대문자, 업무는 모두 대문자로 출력하고 머리글은 Employee JOBs. 로 표시하시오(18행). 
*/
select concat(upper(substr(first_name, 1, 1)), substr(first_name, 2),
	   ' ', concat(upper(substr(last_name, 1, 1)), substr(last_name, 2))) as 'EMPLOYEE',
       upper(job_title) as 'JOBS'
from employees, jobs
where employees.job_id = jobs.job_id
and last_name like '%s';

/*
  [문제 2] 모든 사원의 연봉을 표시하는 보고서를 작성하려고 한다.
  보고서에 사원의 성과 이름(Name으로 별칭), 급여, 수당여부에 따른 연봉을 포함하여 출력하시오.
  수당여부는 수당이 있으면 “Salary + Commission”, 수당이 없으면 “Salary only”라고 표시하고, 별칭은 적절히 붙인다.
  또한 출력 시 연봉이 높은 순으로 정렬한다(107행). IFNULL() 함수, IF() 함수를 이용하여 NULL이었는지 아니었는지를 식별할 수 있다.
 */
 select employee_id, concat(first_name, ' ', last_name) as 'Name',
        salary, ifnull(salary + salary * commission_pct, 'Salary only') as '수당여부'
 from employees;
 
 -- [문제 3] 모든 사원들 성과 이름(Name으로 별칭), 입사일 그리고 입사일이 어떤 요일이였는지 출력하시오.
 -- 이때 주(week)의 시작인 일요일부터 출력되도록 정렬하시오(107행).
 select concat(first_name, ' ', last_name) as 'Name', hire_date, 
        concat(substr('일월화수목금토', dayofweek(hire_date), 1), '요일') as '입사 요일'
 from employees
 order by dayofweek(hire_date), 1;
 
 # A.4 집계된 데이터 보고 : 집계 함수
 /*
   [문제] 모든 사원은 직속 상사 및 직속 직원을 갖는다.
   단, 최상위 또는 최하위 직원은 직속 상사 및 직원이 없다.
   소속된 사원들 중 어떤 사원의 상사로 근무 중인 사원의 총 수를 출력하시오(1행). 
  */
  
  