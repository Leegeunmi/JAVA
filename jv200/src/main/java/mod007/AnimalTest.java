package mod007;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //�������� : �߻�Ŭ������ ��ü�� ������ �� ����.
		Animal animal = new Dog(); //polymorphism
		Animal animal2 = new Cat();
		animal.makeSound();
		animal2.makeSound();
	}
}
