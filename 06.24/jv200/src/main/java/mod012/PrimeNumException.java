package mod012;
import java.util.Scanner;

public class PrimeNumException {
	
	public static int primeNum() throws primeException {		
		Scanner sc = new Scanner(System.in);	
		//����1)���� ������ �����ӳѹ����� �ƴ��� Ȯ���ϰ� ���ܸ� ������.
		//����2)�����ӳѹ��� �̰ͻ��ΰ�. �ٽ� �ѹ� �� �����丵�ϱ�
		//		�����ӳѹ�  ��� ��ü�� �ϳ��� Ŭ������ ����� �� �� �ִ�.
		//		�׶� �����ӳѹ����� ������ ����
		
		//1~1000���� �� �Ҽ� ���ϱ�
		int count = 0;//������ ����ϱ� ���� count
		int inputNum = 0; //�Է¹޴� ��
		
		System.out.println("���ڸ� �Է��ϼ���.(����:1~1000)>>>");
		inputNum = sc.nextInt();
		
		for(int i = inputNum; i < 1000; i++) {
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) {
					throw new primeException("It's a prime number");
//					System.out.print("�Ҽ��Դϴ�.");
				}else {
					throw new primeException("It's not a prime number");
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(primeNum());
		}catch (primeException e) {
			System.err.println(e.getMessage());
		}
	}
}









//���Ǽ�
//�Ҽ��� ������ �迭�� ��� �Է°��� ��
//�Ҽ����� �迭�� �ְ� �Է¹��� ���� �迭�� ���ٸ� �����޼����� ������.