package mod011;

//사용자는 원하는 출금 금액이 잔액보다 크다는 것을 메세지를 통하여 반드시 알 수 있어야한다.
//출금하는 금액이 잔액이 아닌 overdraftAmountr금액 한도 내에서 추가 출금된다는 것을
//메세지를 통해 반드시 알 수 있어야하므로 Exception을 사용
public class InsufficaientBalanceException extends Exception {
	public InsufficaientBalanceException (String msg) {
		super(msg);
	}
}