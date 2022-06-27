CREATE TABLE Customer (
	cid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name			VARCHAR(10)		NOT NULL,
	ssn				VARCHAR(14)		NOT NULL,
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1001;

SELECT * FROM Customer;

INSERT INTO Customer (name, ssn, customerId)
VALUES ('홍길동', '801225-1234567', 1001);

CREATE TABLE Account (
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accountType		CHAR(1)			NOT NULL 	DEFAULT 'S',
	balance			DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.0,
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
)AUTO_INCREMENT = 1001;

INSERT INTO Account (accountType, balance, interestRate, overdraft, customerId)
VALUES ('S', '2000.0', 0.03, 20000.0, 1001);
SELECT * FROM Account, Customer 
WHERE Account.customerId = Customer.cid AND Customer.ssn = '880506-1600000';

SELECT * FROM Account;

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('유비', '880506-1600000', '010-5895-8522', 'java','1111'),
('관우', '956202-1600000', '010-8895-8522', 'eclipse','2222'),
('장비', '852457-2568759', '010-8765-8522', 'sqlsql','3333');