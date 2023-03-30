create table goodsInfo(
num int primary key auto_increment,
code char(7) not null,
name varchar(30) not null,
price int default 0,
maker varchar(20) not null
);

insert into goodsInfo(code, name, price, maker) values ('A001', 'DigitalTV', 520000, 'jeil');
insert into goodsInfo(code, name, price, maker) values ('A002', 'DVD', 240000, 'jeil');
insert into goodsInfo(code, name, price, maker) values ('U101C', 'DSLR', 830000, 'Woosu');
insert into goodsInfo(code, name, price, maker) values ('U405D', 'Electronic Dictionary', 160000, 'Woosu');
insert into goodsInfo(code, name, price, maker) values ('H704', 'Microwave oven', 90000, 'Hana');
insert into goodsInfo(code, name, price, maker) values ('B307', 'Refrigerator', 1500000, 'Woosu');
insert into goodsInfo(code, name, price, maker) values ('M021R', 'Air Conditioner', 1700000, 'Woosu');
insert into goodsInfo(code, name, price, maker) values ('ZT809', 'Air Conditioner', 1400000, 'jeil');

commit;

update goodsInfo
set name = 'Gas Range'
where code = 'H704';

delete from goodsinfo
where maker = 'Woosu';
