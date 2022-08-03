DROP TABLE Customer;
DELETE FROM Customer WHERE cid=1003;
CREATE TABLE Customer(
	cid			BIGINT			PRIMARY KEY AUTO_INCREMENT,
	email		VARCHAR(20)		NOT NULL,
	passwd		VARCHAR(20)		NOT NULL,
	name		VARCHAR(20)		NOT NULL,
	ssn			VARCHAR(14)		NOT NULL, -- 920234-2345678
	phone 		VARCHAR(13)		NOT NULL, -- 010-2345-2345
	regDate		TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1001;

SELECT * FROM Customer

DROP TABLE  MenuCategory;
CREATE TABLE MenuCategory(
	categCode		VARCHAR(20)		PRIMARY KEY,
	categName		VARCHAR(20)		NOT NULL
);
SELECT * FROM MenuCategory;


DROP TABLE MenuItem;
CREATE TABLE MenuItem(
	itemCode		INT				PRIMARY KEY AUTO_INCREMENT,
	itemName 		VARCHAR(20)		NOT NULL,
	itemPrice		DOUBLE			NOT NULL DEFAULT 0.0,
	itemStock		INT				NOT NULL DEFAULT 0
)AUTO_INCREMENT = 2001;
SELECT * FROM MenuItem;


CREATE TABLE Order(
	orderNum 		INT				PRIMARY KEY,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
);
SELECT * FROM Order;


CREATE TABLE DetailOder(
	oderNum 		INT		PRIMARY KEY,
	espresso       	INT		NOT NULL,
	americano       INT		NOT NULL,
	cafelatte       INT		NOT NULL,
	cafemoca        INT		NOT NULL,
	cappuccino      INT		NOT NULL,
	totalPrice		INT		NOT NULL
);
SELECT * FROM DetailOder;

INSERT INTO MenuItems VALUES('Coffee','Espresso','4000','200');
INSERT INTO MenuItems VALUES('Coffee','Americano','3000','200');
INSERT INTO MenuItems VALUES('Coffee','Cafelatte','4000','200');
INSERT INTO MenuItems VALUES('Coffee','Cafemoca','5000','200');
INSERT INTO MenuItems VALUES('Coffee','Cappuccino','5000','200');

--참조키 설정
ALTER TABLE DetailOder ADD FOREIGN KEY(oderNum) REFERENCES Oder(oderNum);

--주문번호 자동증가
--CREATE SEQUENCE TB_BOARD_SEQ


