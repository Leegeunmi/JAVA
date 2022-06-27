package mod008;

/**
 * interface))
 * - abstract메소드의 집합, 상수(public) -변수는 안되고 퍼블릭상수는 가능
 * - 인스턴스 생성 불가
 * - 다중 상속 지원
 * ㄴ
 * @author Administrator
 *
 */

public interface Flyer {
//	public abstract void fly();  //public abstract 생략 되어있음
	public void fly();
	public void takeoff();
	public void land();
}