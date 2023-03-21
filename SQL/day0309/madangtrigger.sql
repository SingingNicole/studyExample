# 5-5. 새로운 도서를 삽입한 후 자동으로 Book_log 테이블에 삽입한 내용을 기록하는 트리거
-- root 계정에서 실행한다.
SET GLOBAL log_bin_trust_function_creators = 1; 
-- 혹은 SET GLOBAL log_bin_trust_function_creators = ON;
show global variables like 'log_bin_trust_function_creators'; -- 현재 만들어진 트리거를 확인할 수 있다.

-- madang에서 실행한다.
CREATE TABLE Book_log(
  bookid_l INTEGER,
  bookname_l VARCHAR(40),
  publisher_l VARCHAR(40),
  price_l INTEGER);

delimiter //
CREATE TRIGGER AfterInsertBook 
  AFTER INSERT ON Book FOR EACH ROW -- for each row: 한 줄마다 기록/new 사용 시 반드시 작성

BEGIN  
  DECLARE average INTEGER;
  INSERT INTO Book_log 
    VALUES(new.bookid, new.bookname, new.publisher, new.price);
END;
//
delimiter ;

/* 삽입한 내용을 기록하는 트리거 확인 */
INSERT INTO Book VALUES(52, '스포츠 과학 1', '이상미디어', 25000);

SELECT * FROM Book WHERE BOOKID = 52;

SELECT * FROM Book_log WHERE BOOKID_L = 52; -- 업데이트 된 내용이 트리거에 기록되어 확인할 수 있다.