package mod011;

//����ڴ� ���ϴ� ��� �ݾ��� �ܾ׺��� ũ�ٴ� ���� �޼����� ���Ͽ� �ݵ�� �� �� �־���Ѵ�.
//����ϴ� �ݾ��� �ܾ��� �ƴ� overdraftAmountr�ݾ� �ѵ� ������ �߰� ��ݵȴٴ� ����
//�޼����� ���� �ݵ�� �� �� �־���ϹǷ� Exception�� ���
public class InsufficaientBalanceException extends Exception {
	public InsufficaientBalanceException (String msg) {
		super(msg);
	}
}