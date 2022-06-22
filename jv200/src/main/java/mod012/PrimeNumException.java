package mod012;
import java.util.Scanner;

public class PrimeNumException {
	
	public static int primeNum() throws primeException {		
		Scanner sc = new Scanner(System.in);	
		//문제1)수를 던지면 프라임넘버인지 아닌지 확인하고 예외를 던진다.
		//문제2)프라임넘버는 이것뿐인가. 다시 한번 더 리팩토링하기
		//		프라임넘버  결과 자체가 하나의 클래스로 만들어 질 수 있다.
		//		그때 프라임넘버에는 무엇이 들어갈까
		
		//1~1000까지 중 소수 구하기
		int count = 0;//갯수를 출력하기 위한 count
		int inputNum = 0; //입력받는 수
		
		System.out.println("숫자를 입력하세요.(범위:1~1000)>>>");
		inputNum = sc.nextInt();
		
		for(int i = inputNum; i < 1000; i++) {
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) {
					throw new primeException("It's a prime number");
//					System.out.print("소수입니다.");
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









//뇌피셜
//소수를 추출해 배열에 담고 입력값과 비교
//소수들을 배열에 넣고 입력받은 값이 배열에 없다면 에러메세지를 던진다.