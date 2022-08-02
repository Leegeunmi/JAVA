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



DROP TABLE MenuItems;
CREATE TABLE MenuItems(
	category		VARCHAR(20)		NOT NULL,
	itemName 		VARCHAR(20)		PRIMARY KEY,
	price			DOUBLE			NOT NULL DEFAULT 0.0,
	quantity		BIGINT			NOT NULL
);
SELECT * FROM MenuItems;


CREATE TABLE Oder(
	oderNum 		BIGINT			PRIMARY KEY,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
);
SELECT * FROM Oder;


CREATE TABLE DetailOder(
	oderNum 		BIGINT		PRIMARY KEY,
	espresso        BIGINT		NOT NULL,
	americano       BIGINT		NOT NULL,
	cafelatte       BIGINT		NOT NULL,
	cafemoca        BIGINT		NOT NULL,
	cappuccino      BIGINT		NOT NULL,
	totalPrice		BIGINT		NOT NULL
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


