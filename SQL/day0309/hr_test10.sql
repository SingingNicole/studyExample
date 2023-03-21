# A.10 분석함수 : NTILE, RANK
/* [문제] 분석함수 NTILE()을 이용하여 부서별 급여합계를 구하시오.
   단, 급여 합계가 제일 큰 것이 1, 제일 작은 것이 4가 되도록 등급을 나누어 출력하고, 등급을 기준으로 오름차순 정렬하시오(12행). 
 */
select department_id, sum(salary) as 'sumSal',
	   ntile(4) over( order by sum(salary) desc) as 'grade'
from employees
group by department_id
order by 3; -- 인덱스 번호를 order by 절에 넣어 해당 인덱스를 기준으로 정렬할 수 있다.

/* [문제 1] 각 사원들이 소속된 부서별로 급여를 기준으로 내림차순 정렬하시오. 이때 다음 세 가지 함수를 이용하여 순위를 그림과 같이 출력하시오(107행). 
RANK() : 동등 순위가 발생하면 다음 순위는 중복된 값만큼 증가시키고 매긴다. / 랭킹 중복자 순위 매기는 것과 같은 방식
DENSE_RANK() : 동등 순위가 발생하면 다음 순위는 중복된 값을 무시하고 바로 다음 번호로 매긴다. / 중복값 고려 X(1111, 2, 33, 4, ...)
ROW_NUMBER() : 동등 순위 자체를 인식하지 않고 매번 번호가 증가하여 매긴다. (같은 값의 순위여도 1, 2, 3, 4, ...)
 */
select employee_id, salary, department_id,
	rank() over (
		partition by department_id 
			order by salary desc) as 'rank' 
from employees;

select employee_id, salary, department_id,
	dense_rank() over (
		partition by department_id 
			order by salary desc) as 'dense_rank' 
from employees;

select employee_id, salary, department_id,
	row_number() over (
		partition by department_id 
			order by salary desc) as 'row_number' 
from employees;

/* [문제 2]
   지정된 개수의 이전, 이후 행의 값을 가져오는 LAG(), LEAD() 함수를 이용하여 
   50번 부서의 사원 정보를 급여순으로 내림차순 정렬하고
   이전, 다음 행의 급여를 함께 출력하시오(45 행).
 */
SELECT employee_id, last_name, salary,
	LAG (salary, 1, 0) over (order by salary DESC) as "Prev_Sal", -- 이전 행의 값을 반환
    LEAD (salary, 1, 0) over (order by salary DESC) as "Next_Sal" -- 다음 행의 값을 반환
    -- 만약 반환값이 null이라면 세 번째 입력 값(0)을 출력
FROM Employees
WHERE department_id = 50;