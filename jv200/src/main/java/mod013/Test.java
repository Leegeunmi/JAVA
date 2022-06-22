package mod013;

import java.util.Scanner;

import mod012.primeException;

class ElementException  extends Exception {
	public ElementException(String s) {
		super(s);
	}
}

public class Test {
	public static int primenum() throws primeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요>>>");
		int inputNum = sc.nextInt();
//		int count = 0;
		
		for(int i = inputNum; i < 1000; i++) {
			for(int j = 2; j <= i; j++) {
				if(i % j == 0) {
					System.out.println("소수입니다.");
				}
				else {
					throw new primeException("It's not a prime number");
				}
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(primenum());
		}catch (primeException e) {
			System.out.println(e.getMessage());
		}
	}
}

