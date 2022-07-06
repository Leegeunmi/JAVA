DROP TABLE User;
CREATE TABLE User (
	cid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	userId			VARCHAR(14)		NOT NULL,
	passwd			VARCHAR(14)		NOT NULL,
	userName		VARCHAR(10)		NOT NULL,
	ssn				VARCHAR(14)		NOT NULL,
	addr			VARCHAR(30)		NOT NULL,
	email			VARCHAR(30)		NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
	
)AUTO_INCREMENT = 1;

SELECT * FROM User;

INSERT INTO User (userId, passwd, userName, ssn, addr, email)
VALUES ('shasha01', 'rmsal01', 'mia', '852014-2578425', '대구 중구 봉덕로50', 'shasha01@naver.com');
