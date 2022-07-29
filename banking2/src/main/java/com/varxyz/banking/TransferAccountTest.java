package com.varxyz.banking;

public class TransferAccountTest {
	public static void main(String[] args) {
		TransferAccount test = new TransferAccount();
		double balance = 5.000;
		String toAccount ="011-55-6666";
		String fromAccount = "022-66-5555";
		
		test.doTransfer(balance, toAccount, fromAccount);
	}
}

//메소드가 하는 핵심적인 이야기
//출금 입금 시 잔액의 변화 (제대로 돈이 들어갔는지 돈이 빠졌는지 테스트)
