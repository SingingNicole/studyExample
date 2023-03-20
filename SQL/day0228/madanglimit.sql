# limit: 잘라오기
	-- limit 인덱스 시작값(생략 시 0), 개수

select * from book order by price desc;
	-- 처음부터 끝까지 오름차순으로 출력됨.
select * from book order by price desc limit 5;
	-- 가장 가격이 큰 5개만 출력.
select * from book order by price desc limit 7, 5;
	-- 7번 인덱스부터 5개 출력. 모자랄 경우 있는 것만 출력.
    
/* 모든 소프트웨어에서 사용할 수 있는 것은 아니며 MySQL에만 존재한다.