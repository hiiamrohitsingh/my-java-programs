package basic_concepts;

public class Interfaces_test {
	public static void main(String args[]) {
		Robot r1 = new Robot();
		r1.speak();

		Hybread h1 = new Hybread();
		h1.speak();

		Animal a1 = new Animal();
		a1.speak();

		Living.random_fun();
		
		C_I ci1 = new C_I();
		
		if(ci1 instanceof  Condition_interfaces) {
			ci1.condtion_check();
		}
		else {
			System.out.println("not intace of it");
		}
		
	}
}

interface Condition_interfaces{
	void condtion_check();
}

class C_I implements Condition_interfaces{
	public void condtion_check() {
		System.out.println("intance of condtion interfaces");
	}
}

class Robot {
	public void speak() {
		System.out.println("Robot is speaking");
	}
}

class Hybread extends Robot implements Living {

}

class Animal implements Living {
	public void speak() {
		System.out.println("Animal is speaking");
	}
}

interface Living {
	default void speak() {
		System.out.println("Living is speacking");
	}

	static void random_fun() {
		System.out.println("Staic fun can be run like Living.random_fun");
	}
}
