package mod011;

public class SavingAccount extends Account {
	private double interestRate;
	
	public void withdraw(double amount) throws InsufficaientBalanceException {
		if(balance - amount < 0) {
			//���ܹ߻�
			throw new InsufficaientBalanceException("�ܰ����");
		}
		super.balance -= amount;
	}
}