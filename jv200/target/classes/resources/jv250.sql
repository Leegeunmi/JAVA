DROP TABLE Sample10;--���̺� �����ϱ� (���� ��������)
CREATE TABLE Sample10 ( --SQL�� ��ҹ��ڸ� �������� ������ ������ ���� ���� �������� ����. ex) Sample10�� Ŭ����ó�� ����
	no 			INT(11)			DEFAULT NULL,
	name		VARCHAR(20)		DEFAULT NULL, --(20) 20�� ���� ������ ����ڴ�
	birthday	DATE			DEFAULT NULL, --����� / TIME�ú���
	address		VARCHAR(40) 	DEFAULT NULL  --NULL / NOT NULL
);

SELECT * FROM Sample10;

INSERT INTO Sample10 VALUES (1,'����', '1996-12-17', '�뱸 �ϱ� �˴ܷ�'); --���ڴ� ''��� '��ü�� ����ϰ������ ''�ΰ� ���
INSERT INTO Sample10 VALUES (2,'����', '1992-05-06', '�뱸 �߱� �߾ӷ�'); --ex)'Tom's house' --> 'Tom''s house'
INSERT INTO Sample10 VALUES (3,'���', '1990-10-11', '�뱸 ���� �����');

--CREATE TABLE Customer (
--	cid				BIGINT			PRIMARY KEY AUTO_INCREMENT, --NOT NULL�� ����� NOT NULL�̴�.
--	name			VARCHAR(20)		NOT NULL, --�ݵ�� ���� �ʿ��ϸ� NOT NULL
--	ssn				VARCHAR(14)		NOT NULL, --������(-)�� ���� -> ���� ����� ���� �ӿ� -�� ���̸� ����Ÿ ����
--	phone			VARCHAR(14)		NOT NULL,
--	customerId		VARCHAR(16)		NOT NULL,
--	passwd			VARCHAR(16)		NOT NULL,
--	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP
--) AUTO_INCREMENT = 1001; --1000���� �����ؼ� 1001 1002 1003 ... ����

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
VALUES ('����', '880506-1600000', '010-5895-8522', 'java','1111'),
('����', '956202-1600000', '010-8895-8522', 'eclipse','2222'),
('���', '852457-2568759', '010-8765-8522', 'sqlsql','3333');

UPDATE Customer SET ssn='880707-1600000', phone='010-5555-1234' WHERE cid=1001;
--����(1001)�� �ֹι�ȣ�� ����ȣ �����ϱ�

DELETE FROM Customer WHERE cid=1002;
--����(1002)�� ���� �����ϱ�


--���̺��� �����ϴ� �� --> Foreign Key
--cid -> Foreign Key
--pk�� �����ڷμ��� ���Ҹ��� �ϰ� �ǹ̰� ����.
--aid�� �츮�� ���������� �ƴϰ�, accountNum�� �츮�� ���������̴�.
--�ε��� : �����Ͽ� ����ã�� �� �ְ��Ѵ�.
--artificial key : ����Ű

DROP TABLE Account;
CREATE TABLE Account (
	aid				BIGINT			PRIMARY KEY AUTO_INCREMENT, -- �ڵ����� �ѹ������ش�.
	accountNum		VARCHAR(11)		NOT NULL,	-- 111-11-1111
	balance			DOUBLE			NOT NULL	DEFAULT 0.0,
	interestRate	DOUBLE			NOT NULL	DEFAULT 0.0,
	overdraft		DOUBLE			NOT NULL	DEFAULT 0.0,
	accountType		CHAR(1)			NOT NULL 	DEFAULT 'S',
	customerId		BIGINT			NOT NULL,
	regDate			TIMESTAMP		NOT NULL	DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT Account_customerId_FK FOREIGN KEY (customerId) REFERENCES Customer(cid)
	-- Account���̺� �ȿ� customerId�� Customer���̺�ȿ� �ִ� cid�� �����Ѵ�.
	-- CONSTRAINT�� �Ƚ��ָ� DB�� �˾Ƽ� �˼����� �̸����� �����. �̸��� ���� ����� �ִ� ���� ����.

)AUTO_INCREMENT = 3001; -- aid�� ����.  3001���� �ѹ��� �ȴ�.

INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId)
VALUES ('50-96-5025', 8796000, 0.5, 2000000, 'S', 1001);
SELECT * FROM Account;
