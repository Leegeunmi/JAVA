package mod011;

public class CheckingAccount extends Account {
	private double overdraftAmount;
	
	public void withdraw(double amount) throws InsufficaientBalanceException {
		if(balance < amount) {
			//�ܰ� ���� �� overdraftAmount �ݾ� �ѵ� ������ �߰� ����� ����
//			withdraw(overdraftAmount); //����
			throw new InsufficaientBalanceException("��ݺҰ�");
		}else {
			balance -= amount;
		}
	}
}
