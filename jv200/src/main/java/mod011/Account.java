package mod011;

public class Account {
	private String accountNum;
	protected double balance;
	
	public void deposite(double amount) {
		balance += amount;
	}
	
	public static void main(String[] args) {
		Account a = new Account();
//		System.out.println(deposite(balance));
	}
}
