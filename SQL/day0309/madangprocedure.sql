# book 테이블에 한 개의 투플을 삽입하는 프로시저
-- drop PROCEDURE InsertBook; -- 존재한다면 삭제
delimiter // -- 다시 delimiter가 나올 때까지 ; 붙어도 묶어 수행
CREATE PROCEDURE InsertBook(
  IN myBookID INTEGER, -- in: 값 받아와서 변수에 저장/지정하지 않아도 기본값으로 지정
  IN myBookName VARCHAR(40), 
  IN myPublisher VARCHAR(40), 
  IN myPrice INTEGER)
BEGIN
  INSERT INTO Book(bookid, bookname, publisher, price)
      VALUES(myBookID, myBookName, myPublisher, myPrice);
END; -- end 뒤에 ; 필수
//
delimiter ;

## 프로시저 InsertBook을 테스트하는 부분
CALL InsertBook(50, '스포츠과학', '마당과학서적', 25000);
SELECT * FROM Book;

# 5-2. 동일한 도서가 있는지 점검 후 삽입하는 프로시저
delimiter //
CREATE PROCEDURE BookInsertOrUpdate(
  myBookID INTEGER,
  myBookName VARCHAR(40), 
  myPublisher VARCHAR(40),
  myPrice INT) 
BEGIN
  DECLARE mycount INTEGER;
  SELECT count(*) INTO mycount FROM Book 
    WHERE bookname LIKE myBookName; 
  IF mycount != 0 THEN
    UPDATE Book SET price = myPrice
      WHERE bookname LIKE myBookName;
  ELSE
    INSERT INTO Book(bookid, bookname, publisher, price)
      VALUES(myBookID, myBookName, myPublisher, myPrice);
  END IF;
END;
//
delimiter ;

## BookInsertOrUpdate 프로시저를 실행하여 테스트하는 부분
CALL BookInsertOrUpdate(51, '스포츠 즐거움', '마당과학서적', 25000);
SELECT * FROM Book; -- 15번 투플 삽입 결과 확인

## BookInsertOrUpdate 프로시저를 실행하여 테스트하는 부분
CALL BookInsertOrUpdate(51, '스포츠 즐거움', '마당과학서적', 20000);
SELECT * FROM Book; -- 15번 투플 가격 변경 확인

# 5-3. 결과를 반환하는 프로시저
delimiter //
CREATE PROCEDURE AveragePrice(
  OUT AverageVal INTEGER)
BEGIN
  SELECT AVG(price) INTO AverageVal 
  FROM Book WHERE price IS NOT NULL;
END;
//
delimiter ;

## 프로시저 AveragePrice를 테스트하는 부분
CALL AveragePrice(@myValue);
SELECT @myValue;

# 5-4. orders 테이블의 판매 도서에 대한 이익을 계산하는 프로시저
delimiter //  
CREATE PROCEDURE Interest()

BEGIN
  DECLARE myInterest INTEGER DEFAULT 0.0;
  DECLARE Price INTEGER;
  DECLARE endOfRow BOOLEAN DEFAULT FALSE; 
  DECLARE InterestCursor CURSOR FOR 
	SELECT saleprice FROM Orders;
    
  DECLARE CONTINUE handler 
	FOR NOT FOUND SET endOfRow = TRUE;
    
OPEN InterestCursor;
  cursor_loop: LOOP
    FETCH InterestCursor INTO Price;
    
    IF endOfRow THEN LEAVE cursor_loop; 
    END IF;
    IF Price >= 30000 THEN 
        SET myInterest = myInterest + Price * 0.1;
    ELSE 
        SET myInterest = myInterest + Price * 0.05;
    END IF;
  END LOOP cursor_loop;
  
  CLOSE InterestCursor;
  
  SELECT CONCAT(' 전체 이익 금액 = ', myInterest);
  
END;
//
delimiter ;

## interest 프로시저를 실행하여 판매된 도서에 대한 이익금 계산
CALL Interest();