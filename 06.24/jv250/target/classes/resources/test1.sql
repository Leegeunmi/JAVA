CREATE TABLE Customer1 (
	cid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name			VARCHAR(10)		NOT NULL,
	ssn				VARCHAR(14)		NOT NULL,
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
	
)AUTO_INCREMENT = 1001;

SELECT * FROM Customer1;

INSERT INTO Customer1 (name, ssn, customerId)
VALUES ('ȫ�浿', '801225-1234567', 1001);

CREATE TABLE Account1 (
	aid					BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accType				CHAR(1)			NOT NULL 	DEFAULT 'S',
	balance				DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate		DOUBLE			NOT NULL	DEFAULT 0.0,
	overdraftAmount		DOUBLE			NOT NULL	DEFAULT 0.0,
	customerId			BIGINT			NOT NULL,
	regDate				TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account1_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer1(cid)

)AUTO_INCREMENT = 2001;

SELECT * FROM Account1;

INSERT INTO Account1 (accType, balance, interestRate, overdraftAmount, customerId)
VALUES ('S', '2000.0', 0.03, 20000.0, 1001);

