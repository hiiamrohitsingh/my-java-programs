package basic_concepts;

public class Method_dispatch {

	public static void main(String[] args) {
		
		A obj1 = new A();
		B objb1 = new B();
		
		A b; // Initialized as null
		
		b = obj1; 
		b.show();
		
		b = objb1;
		b.show();
		
	}
	
}

class A{
	public void show() {
		System.out.println("this is coming from A");
	}
}

class B extends A{
	public void show() {
		System.out.println("this is coming from B");
	}
}