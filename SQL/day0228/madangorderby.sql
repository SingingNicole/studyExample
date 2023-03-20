select * from book order by bookname;
select * from book order by price;
	# order by: 원하는 순서대로 데이터를 정렬하여 출력한다.
	-- asc/desc를 생략했을 경우 기본적으로 오름차순으로 출력한다.

select * from book order by price, bookname;
	-- price를 기준으로 먼저 정렬하고, 같은 값을 가지고 있는 데이터들을 bookname을 기준으로 다시 정렬한다.

select * from book order by price desc, publisher asc;
	-- price를 기준으로 내림차순, 이후 publisher의 값에 따라 오름차순으로 정리.
    -- asc는 생략 가능(기본적으로 오름차순 정렬)

select * from book where bookname like '%축구%' order by price desc, bookname;
	-- 책 이름에 '축구'라는 단어가 들어가 있는 목록을 가격 순으로 내림차순 정렬하고 책 이름에 따라 다시 오름차순 정렬한다.