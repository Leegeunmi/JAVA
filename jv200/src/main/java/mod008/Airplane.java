package mod008;

public class Airplane implements Flyer, Vehicle { //�������̽��� �θ�� �� ��쿡�� implements
	
	Airplane() {
		
	}
	
	public void fly() {
		System.out.println("����� : ����");
		
	}

	public void takeoff() {
		System.out.println("����� : �̷��ϱ�");
		
	}

	public void land() {
		System.out.println("����� : �����ϱ�");
		
	}
}
