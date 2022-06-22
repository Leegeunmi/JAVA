package mod008;

public class Airplane implements Flyer, Vehicle { //인터페이스가 부모로 온 경우에는 implements
	
	Airplane() {
		
	}
	
	public void fly() {
		System.out.println("비행기 : 날기");
		
	}

	public void takeoff() {
		System.out.println("비행기 : 이륙하기");
		
	}

	public void land() {
		System.out.println("비행기 : 착륙하기");
		
	}
}
