package mod011;

public class SavingAccount extends Account {
	private double interestRate;
	
	public void withdraw(double amount) throws InsufficaientBalanceException {
		if(balance - amount < 0) {
			//예외발생
			throw new InsufficaientBalanceException("잔고부족");
		}
		super.balance -= amount;
	}
}