package mod011;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public void withdraw(double amount) throws InsufficaientBalanceException {
		if(balance < amount) {
			//잔고 부족 시 overdraftAmount 금액 한도 내에서 추가 출금을 승인
//			withdraw(overdraftAmount); //수정
			throw new InsufficaientBalanceException("출금불가");
		}else {
			balance -= amount;
		}
	}
}
