package mod007;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //에러이유 : 추상클래스는 객체를 생성할 수 없다.
		Animal animal = new Dog(); //polymorphism
		Animal animal2 = new Cat();
		animal.makeSound();
		animal2.makeSound();
	}
}
