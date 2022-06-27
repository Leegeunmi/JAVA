DROP TABLE Customer2;
CREATE TABLE Customer2 (
	cid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name			VARCHAR(10)		NOT NULL,
	ssn				VARCHAR(14)		NOT NULL,
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
	
)AUTO_INCREMENT = 1002;

SELECT * FROM Customer2;

INSERT INTO Customer2 (name, ssn, customerId)
VALUES ('James Bond', '900101-1234567', 1001);

UPDATE Customer2 SET name='Jason Bourne' WHERE cid=1002;
DELETE FROM Customer2 WHERE cid=1002;

CREATE TABLE Account2 (
	aid					BIGINT			PRIMARY KEY AUTO_INCREMENT,
	accType				CHAR(1)			NOT NULL 	DEFAULT 'S',
	balance				DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate		DOUBLE			NOT NULL	DEFAULT 0.0,
	overdraftAmount		DOUBLE			NOT NULL	DEFAULT 0.0,
	customerId			BIGINT			NOT NULL,
	regDate				TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account2_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer2(cid)

)AUTO_INCREMENT = 3001;

SELECT * FROM Account2;

INSERT INTO Account2 (accType, balance, interestRate, overdraftAmount, customerId)
VALUES ('C', '2000.0', 0.03, 0.0, 1001);


SELECT * FROM Account a INNER JOIN Customer c ON a.customerId = c.id;
WHERE ssn = '840104-1234567';
