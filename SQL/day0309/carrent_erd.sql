-- 테이블 순서는 관계를 고려하여 한 번에 실행해도 에러가 발생하지 않게 정렬되었습니다.

-- C_CAR_RENT_COMP Table Create SQL
-- 테이블 생성 SQL - C_CAR_RENT_COMP
CREATE TABLE C_CAR_RENT_COMP
(
    `c_car_rent_comp_id`  VARCHAR(10)     NOT NULL    COMMENT '캠핑카대여회사ID', 
    `c_comp_name`         VARCHAR(25)     NOT NULL    COMMENT '회사명', 
    `c_comp_addr`         VARCHAR(100)    NOT NULL    COMMENT '주소', 
    `c_comp_phone`        VARCHAR(15)     NOT NULL    COMMENT '전화번호', 
    `c_comp_admin_name`   VARCHAR(25)     NOT NULL    COMMENT '담당자 이름', 
    `c_comp_admin_email`  VARCHAR(50)     NOT NULL    COMMENT '담당자 이메일', 
     PRIMARY KEY (c_car_rent_comp_id)
);

-- 테이블 Comment 설정 SQL - C_CAR_RENT_COMP
ALTER TABLE C_CAR_RENT_COMP COMMENT '캠핑카 대여 회사';


-- C_CARS Table Create SQL
-- 테이블 생성 SQL - C_CARS
CREATE TABLE C_CARS
(
    `c_car_reg_id`        VARCHAR(10)      NOT NULL    COMMENT '캠핑카등록ID', 
    `c_car_rent_comp_id`  VARCHAR(10)      NOT NULL    COMMENT '캠핑카대여회사ID', 
    `c_car_name`          VARCHAR(25)      NOT NULL    COMMENT '캠핑카이름', 
    `c_car_int`           VARCHAR(10)      NOT NULL    COMMENT '캠핑카차량번호', 
    `c_car_capa`          INT(2)           NOT NULL    COMMENT '캠핑카승차인원', 
    `c_car_detail`        VARCHAR(1000)    NOT NULL    COMMENT '캠핑카상세정보', 
    `c_car_rent_price`    INT(7)           NOT NULL    COMMENT '캠핑카대여비용', 
    `c_car_reg_date`      DATE             NOT NULL    COMMENT '캠핑카등록일자', 
     PRIMARY KEY (c_car_reg_id)
);

-- 테이블 Comment 설정 SQL - C_CARS
ALTER TABLE C_CARS COMMENT '캠핑카';

-- Foreign Key 설정 SQL - C_CARS(c_car_rent_comp_id) -> C_CAR_RENT_COMP(c_car_rent_comp_id)
ALTER TABLE C_CARS
    ADD CONSTRAINT FK_C_CARS_c_car_rent_comp_id_C_CAR_RENT_COMP_c_car_rent_comp_id FOREIGN KEY (c_car_rent_comp_id)
        REFERENCES C_CAR_RENT_COMP (c_car_rent_comp_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - C_CARS(c_car_rent_comp_id)
-- ALTER TABLE C_CARS
-- DROP FOREIGN KEY FK_C_CARS_c_car_rent_comp_id_C_CAR_RENT_COMP_c_car_rent_comp_id;


-- CUSTOMER Table Create SQL
-- 테이블 생성 SQL - CUSTOMER
CREATE TABLE CUSTOMER
(
    `cust_driver_license_id`  VARCHAR(25)     NOT NULL    COMMENT '운전면허번호', 
    `cust_name`               VARCHAR(20)    NOT NULL    COMMENT '고객명', 
    `cust_addr`               VARCHAR(100)    NOT NULL    COMMENT '고객주소', 
    `cust_phone`              VARCHAR(15)    NOT NULL    COMMENT '고객전화번호', 
    `cust_email`              VARCHAR(50)     NOT NULL    COMMENT '고객이메일', 
    `cust_past_used_date`     DATE            NULL        COMMENT '이전캠핑카이용날짜', 
    `cust_past_used_type`     DATE            NULL        COMMENT '이전사용캠핑카종류', 
     PRIMARY KEY (cust_driver_license_id)
);

-- 테이블 Comment 설정 SQL - CUSTOMER
ALTER TABLE CUSTOMER COMMENT '고객';


-- C_CAR_REPAIR_INFORM Table Create SQL
-- 테이블 생성 SQL - C_CAR_REPAIR_INFORM
CREATE TABLE C_CAR_REPAIR_INFORM
(
    `repair_int`              VARCHAR(25)    NOT NULL    COMMENT '정비번호', 
    `c_car_reg_id`            VARCHAR(10)    NOT NULL    COMMENT '캠핑카등록ID', 
    `c_car_garage_id`         VARCHAR(10)    NOT NULL    COMMENT '캠핑카정비소ID', 
    `c_car_rent_comp_id`      VARCHAR(10)    NOT NULL    COMMENT '캠핑카대여회사ID', 
    `cust_driver_license_id`  VARCHAR(25)    NOT NULL    COMMENT '고객운전면허번호', 
    `repair_contents`         VARCHAR(15)    NOT NULL    COMMENT '정비내역', 
    `repair_date`             DATE           NOT NULL    COMMENT '수리날짜', 
    `repair_price`            INT(10)        NOT NULL    COMMENT '수리비용', 
    `price_deadline`          DATE           NOT NULL    COMMENT '납입기한', 
    `add_repair_contents`     VARCHAR(30)    NULL        COMMENT '기타정비내역', 
     PRIMARY KEY (repair_int)
);

-- 테이블 Comment 설정 SQL - C_CAR_REPAIR_INFORM
ALTER TABLE C_CAR_REPAIR_INFORM COMMENT '캠핑카정비정보';

-- Foreign Key 설정 SQL - C_CAR_REPAIR_INFORM(c_car_reg_id) -> C_CARS(c_car_reg_id)
ALTER TABLE C_CAR_REPAIR_INFORM
    ADD CONSTRAINT FK_C_CAR_REPAIR_INFORM_c_car_reg_id_C_CARS_c_car_reg_id FOREIGN KEY (c_car_reg_id)
        REFERENCES C_CARS (c_car_reg_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - C_CAR_REPAIR_INFORM(c_car_reg_id)
-- ALTER TABLE C_CAR_REPAIR_INFORM
-- DROP FOREIGN KEY FK_C_CAR_REPAIR_INFORM_c_car_reg_id_C_CARS_c_car_reg_id;

-- Foreign Key 설정 SQL - C_CAR_REPAIR_INFORM(c_car_rent_comp_id) -> C_CAR_RENT_COMP(c_car_rent_comp_id)
ALTER TABLE C_CAR_REPAIR_INFORM
    ADD CONSTRAINT FK_C_CAR_REPAIR_INFORM_c_car_rent_comp_id_C_CAR_RENT_COMP_c_car_ FOREIGN KEY (c_car_rent_comp_id)
        REFERENCES C_CAR_RENT_COMP (c_car_rent_comp_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - C_CAR_REPAIR_INFORM(c_car_rent_comp_id)
-- ALTER TABLE C_CAR_REPAIR_INFORM
-- DROP FOREIGN KEY FK_C_CAR_REPAIR_INFORM_c_car_rent_comp_id_C_CAR_RENT_COMP_c_car_;

-- Foreign Key 설정 SQL - C_CAR_REPAIR_INFORM(cust_driver_license_id) -> CUSTOMER(cust_driver_license_id)
ALTER TABLE C_CAR_REPAIR_INFORM
    ADD CONSTRAINT FK_C_CAR_REPAIR_INFORM_cust_driver_license_id_CUSTOMER_cust_driv FOREIGN KEY (cust_driver_license_id)
        REFERENCES CUSTOMER (cust_driver_license_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - C_CAR_REPAIR_INFORM(cust_driver_license_id)
-- ALTER TABLE C_CAR_REPAIR_INFORM
-- DROP FOREIGN KEY FK_C_CAR_REPAIR_INFORM_cust_driver_license_id_CUSTOMER_cust_driv;


-- C_CAR_RENT Table Create SQL
-- 테이블 생성 SQL - C_CAR_RENT
CREATE TABLE C_CAR_RENT
(
    `c_car_rent_id`           INT(10)         NOT NULL    COMMENT '대여번호', 
    `c_car_reg_id`            VARCHAR(10)     NOT NULL    COMMENT '캠핑카등록ID', 
    `cust_driver_license_id`  VARCHAR(25)     NOT NULL    COMMENT '운전면허증번호', 
    `c_car_rent_comp_id`      VARCHAR(10)     NOT NULL    COMMENT '캠핑카대여회사ID', 
    `c_car_rent_start_date`   DATE            NOT NULL    COMMENT '대여시작일', 
    `c_car_rent_period`       INT(3)          NOT NULL    COMMENT '대여기간', 
    `charge_price`            INT(10)         NOT NULL    COMMENT '청구요금', 
    `price_deadline`          DATE            NOT NULL    COMMENT '납입기한', 
    `add_amount_contents`     VARCHAR(300)    NULL        COMMENT '기타청구내역', 
    `add_amount_price`        INT(10)         NULL        COMMENT '기타청구요금', 
     PRIMARY KEY (c_car_rent_id)
);

-- 테이블 Comment 설정 SQL - C_CAR_RENT
ALTER TABLE C_CAR_RENT COMMENT '캠핑카대여';

-- Foreign Key 설정 SQL - C_CAR_RENT(c_car_reg_id) -> C_CAR_REPAIR_INFORM(c_car_reg_id)
ALTER TABLE C_CAR_RENT
    ADD CONSTRAINT FK_C_CAR_RENT_c_car_reg_id_C_CAR_REPAIR_INFORM_c_car_reg_id FOREIGN KEY (c_car_reg_id)
        REFERENCES C_CAR_REPAIR_INFORM (c_car_reg_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - C_CAR_RENT(c_car_reg_id)
-- ALTER TABLE C_CAR_RENT
-- DROP FOREIGN KEY FK_C_CAR_RENT_c_car_reg_id_C_CAR_REPAIR_INFORM_c_car_reg_id;

-- Foreign Key 설정 SQL - C_CAR_RENT(cust_driver_license_id) -> CUSTOMER(cust_driver_license_id)
ALTER TABLE C_CAR_RENT
    ADD CONSTRAINT FK_C_CAR_RENT_cust_driver_license_id_CUSTOMER_cust_driver_licens FOREIGN KEY (cust_driver_license_id)
        REFERENCES CUSTOMER (cust_driver_license_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - C_CAR_RENT(cust_driver_license_id)
-- ALTER TABLE C_CAR_RENT
-- DROP FOREIGN KEY FK_C_CAR_RENT_cust_driver_license_id_CUSTOMER_cust_driver_licens;

-- Foreign Key 설정 SQL - C_CAR_RENT(c_car_rent_comp_id) -> C_CAR_RENT_COMP(c_car_rent_comp_id)
ALTER TABLE C_CAR_RENT
    ADD CONSTRAINT FK_C_CAR_RENT_c_car_rent_comp_id_C_CAR_RENT_COMP_c_car_rent_comp FOREIGN KEY (c_car_rent_comp_id)
        REFERENCES C_CAR_RENT_COMP (c_car_rent_comp_id) ON DELETE RESTRICT ON UPDATE RESTRICT;

-- Foreign Key 삭제 SQL - C_CAR_RENT(c_car_rent_comp_id)
-- ALTER TABLE C_CAR_RENT
-- DROP FOREIGN KEY FK_C_CAR_RENT_c_car_rent_comp_id_C_CAR_RENT_COMP_c_car_rent_comp;
