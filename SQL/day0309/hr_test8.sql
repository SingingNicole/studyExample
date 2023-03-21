/*
  [문제] HR 부서에서는 신규 프로젝트의 성공으로 해당하는 각 업무 자들에 대한 급여 인상안을 결정하고, 다음과 같이 업무 별 급여 인상에 대해 적용하고자 한다.
  현재 107명의 사원은 19개의 업무에 소속되어 근무 중이다. (Distinct job_id)
  이 중 5개의 업무자들에 대한 급여 인상이 각각 결정되었고, 나머지 업무에 대해서는 인상이 동결되었다 (107행).
  HR_REP(10%), MK_REP(12%), PR_REP(15%), SA_REP(18%), IT_PROG(20%) CASE와 DECODE를 이용하여 위 조건을 만족하는 구문을 작성해 본다.
 */
select concat(first_name, ' ', last_name) as 'Name', job_id, salary,
case job_id when 'HR_REP' then salary * 1.10
			when 'MK_REP' then salary * 1.12
            when 'PR_REP' then salary * 1.15
            when 'SA_REP' then salary * 1.18
            when 'IT_PROG' then salary * 1.20
            else salary * 1
            end as 'Increased Salary'
from employees;

