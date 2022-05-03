package learning_java;

public class First_Class {
	
	//data types in java
	
	int intdata = 2147483647;
	float floatdata = 333.55f;
	char chardata = 'c';
	
	static byte count = 0;
	
	public First_Class() {
		count++;
		System.out.println("the obj of first class is created");
		System.out.println("the obj "+count+" is created of first class");
	}
	
	static void i_am_a_static_fun() {
		System.out.println("i am can be called with class");
	}

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		sc.close();
		
		First_Class obj1 = new First_Class();
		
		System.out.println(obj1.intdata);
		System.out.println(obj1.floatdata);
		System.out.println(obj1.chardata);
		
		First_Class.i_am_a_static_fun();
	}

}
