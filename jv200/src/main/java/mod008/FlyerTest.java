package mod008;

public class FlyerTest {
	public static void main(String[] args) {
		Flyer f = new Airplane(); //polymorphism
//		Flyer f = getFlyer();
		//new Airplane�� 100000���� �ȴٴ� �����Ͽ�
		//Airplane�� Ufo�� �ٲ������ 100000�� �����ؾߵȴ�.
		//Flyer f = getFlyer(); �ϰԵǸ�
		//gerFlyer()�ȿ� ������ �� �ִ��� �𸣰� �ȴ�.
		//�׸��� ���ڵ�� ������� �ִ��� �ٲ��� �ʴ� �ڵ��� ��.
		f.takeoff();
		f.fly();
		
		Flyer f2 = new Bird();
		f2.takeoff(); 
	}
}
