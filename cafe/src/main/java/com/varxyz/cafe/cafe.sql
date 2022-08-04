DROP TABLE Manager;
DELETE FROM Manager WHERE cid=1003;
CREATE TABLE Manager(
	mid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	branchName		VARCHAR(20)		NOT NULL,
	managerName		VARCHAR(20)		NOT NULL,
	phone			VARCHAR(13)		NOT NULL, -- 010-2345-2345
	passwd			VARCHAR(14)		NOT NULL, 
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1001;
SELECT * FROM Manager;


DROP TABLE  MenuCategory;
CREATE TABLE MenuCategory(
	categCode		VARCHAR(20)		PRIMARY KEY,
	categName		VARCHAR(20)		NOT NULL
);
SELECT * FROM MenuCategory;


DELETE FROM MenuItem WHERE cid=2001;
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


