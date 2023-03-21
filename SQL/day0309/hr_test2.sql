# A.2 데이터 제한 및 정렬 : WHERE, ORDER BY
/*
  [문제] HR 부서에서 예산 편성 문제로 급여 정보 보고서를 작성하려고 한다.
  사원정보(EMPLOYEES) 테이블에서 급여가 $7,000~$10,000 범위 이외인 사람의 성과 이름(Name으로 별칭) 및 급여를 급여가 작은 순서로 출력하시오(75행). 
 */
 select concat(first_name, ' ', last_name) as 'Name', salary
 from employees
 where salary not between 7000 and 10000
 order by salary;
 
 -- [문제 1] 사원의 이름(last_name) 중에 ‘e’ 및 ‘o’ 글자가 포함된 사원을 출력하시오. 이때 머리글은 ‘e and o Name’라고 출력하시오(10행).
 select last_name as 'e and o Name'
 from employees
 where last_name like '%e%'
 and last_name like '%o%';
 
 -- [문제 2] 현재 날짜 타입을 날짜 함수를 통해 확인하고, 1995년 05월 20일부터 1996년 05월 20일 사이에 고용된 사원들의 성과 이름(Name으로 별칭), 사원번호, 고용일자를 출력하시오.
 -- 단, 입사일이 빠른 순으로 정렬하시오(8행).
 select now();
 select date(now());
 select concat(first_name, ' ', last_name) as 'Name', employee_id, hire_date
 from employees
 where hire_date between '1995-05-20' and '1996-05-20'
 order by hire_date;
 
 /*
   [문제 3] HR 부서에서는 급여(salary)와 수당율(commission_pct)에 대한 지출 보고서를 작성하려고 한다.
   이에 수당을 받는 모든 사원의 성과 이름(Name으로 별칭), 급여, 업무, 수당율을 출력하시오.
   이때 급여가 큰 순서대로 정렬하되, 급여가 같으면 수당율이 큰 순서대로 정렬하시오(35 행). 
 */
 select concat(first_name, ' ', last_name) as 'Name', salary, job_title, commission_pct
 from employees, jobs
 where employees.job_id = jobs.job_id
 and commission_pct is not null
 order by salary desc, commission_pct desc;