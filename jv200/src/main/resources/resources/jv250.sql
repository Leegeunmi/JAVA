DROP TABLE Sample10;--테이블 삭제하기 (아직 삭제안함)
CREATE TABLE Sample10 ( --SQL은 대소문자를 구분하지 않으나 구분을 짓는 것이 가독성이 좋다. ex) Sample10을 클래스처럼 적기
	no 			INT(11)			DEFAULT NULL,
	name		VARCHAR(20)		DEFAULT NULL, --(20) 20자 들어올 공간을 만들겠다
	birthday	DATE			DEFAULT NULL, --년월일 / TIME시분초
	address		VARCHAR(40) 	DEFAULT NULL  --NULL / NOT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1,'유비', '1996-12-17', '대구 북구 검단로'); --글자는 ''사용 '자체를 사용하고싶으면 ''두개 사용
INSERT INTO Sample10 VALUES (2,'관우', '1992-05-06', '대구 중구 중앙로'); --ex)'Tom's house' --> 'Tom''s house'
INSERT INTO Sample10 VALUES (3,'장비', '1990-10-11', '대구 남구 명덕로');

--CREATE TABLE Customer (
--	cid				BIGINT			PRIMARY KEY AUTO_INCREMENT, --NOT NULL을 안적어도 NOT NULL이다.
--	name			VARCHAR(20)		NOT NULL, --반드시 값이 필요하면 NOT NULL
--	ssn				VARCHAR(14)		NOT NULL, --하이픈(-)은 생략 -> 많은 사람의 정보 속에 -이 모이면 데이타 낭비
--	phone			VARCHAR(14)		NOT NULL,
--	customerId		VARCHAR(16)		NOT NULL,
--	passwd			VARCHAR(16)		NOT NULL,
--	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
--) AUTO_INCREMENT = 1001; --1000부터 시작해서 1001 1002 1003 ... 증가

CREATE TABLE Customer (
	cid				BIGINT			PRIMARY KEY AUTO_INCREMENT,
	name			VARCHAR(20)		NOT NULL,
	ssn				VARCHAR(14)		NOT NULL,
	phone			VARCHAR(14)		NOT NULL,
	customerId		VARCHAR(16)		NOT NULL,
	passwd			VARCHAR(16)		NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
) AUTO_INCREMENT = 1001;

SELECT * FROM Customer;

INSERT INTO Customer (name, ssn, phone, customerId, passwd)
VALUES ('유비', '880506-1600000', '010-5895-8522', 'java','1111'),
('관우', '956202-1600000', '010-8895-8522', 'eclipse','2222'),
('장비', '852457-2568759', '010-8765-8522', 'sqlsql','3333');

UPDATE Customer SET ssn='880707-1600000', phone='010-5555-1234' WHERE cid=1001;
--유비(1001)의 주민번호와 폰번호 수정하기

DELETE FROM Customer WHERE cid=1002;
--관우(1002)의 정보 삭제하기


--테이블끼리 연결하는 것 --> Foreign Key
--cid -> Foreign Key
--pk는 구분자로서의 역할만을 하고 의미가 없다.
--aid는 우리의 결정사항이 아니고, accountNum은 우리의 결정사항이다.
--인덱싱 : 나열하여 빨리찾을 수 있게한다.
--artificial key : 인조키

DROP TABLE Account;
CREATE TABLE Account (
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT, -- 자동으로 넘버링해준다.
	accountNum		VARCHAR(11)		NOT NULL,	-- 111-11-1111
	balance			DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.0,
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	accountType		CHAR(1)			NOT NULL 	DEFAULT 'S',
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)
	-- Account테이블 안에 customerId는 Customer테이블안에 있는 cid를 참조한다.
	-- CONSTRAINT를 안써주면 DB가 알아서 알수없는 이름으로 만든다. 이름을 따로 만들어 주는 것이 좋다.

)AUTO_INCREMENT = 3001; -- aid와 같다.  3001부터 넘버링 된다.

INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId)
VALUES ('50-96-5025', 8796000, 0.5, 2000000, 'S', 1001);
SELECT * FROM Account;
