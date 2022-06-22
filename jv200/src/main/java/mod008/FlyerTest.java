package mod008;

public class FlyerTest {
	public static void main(String[] args) {
		Flyer f = new Airplane(); //polymorphism
//		Flyer f = getFlyer();
		//new Airplane이 100000개가 된다는 가정하에
		//Airplane이 Ufo로 바뀌었을때 100000번 수정해야된다.
		//Flyer f = getFlyer(); 하게되면
		//gerFlyer()안에 무엇이 들어가 있는지 모르게 된다.
		//그말은 이코드는 어떤변경이 있더라도 바뀌지 않는 코드인 것.
		f.takeoff();
		f.fly();
		
		Flyer f2 = new Bird();
		f2.takeoff(); 
	}
}
