package learning_java;

public class Third_Class {

	public static void main(String[] args) {
		Myclass myobj1 = new Myclass();
		Myclass myobj2 = new Myclass();
		Myclass myobj3 = new Myclass();
		Myclass myobj4 = new Myclass();
		Myclass myobj5 = new Myclass(21,"Rohit");
		Myclass myobj6 = new Myclass(22,"Sohan","BCA");
		
		Myclass.obj_count();
	}

}

class Myclass{
	
	int age;
	String name;
	String course;
	
	static int count = 0; // a variable to count how many object is created of this class
	
	public Myclass() {
		count++;
		System.out.println("the default contruction is called "+this.getClass());
	}
	
	public Myclass(int a,String n) {
		this();
		age = a;
		name = n;
		System.out.println("the name of obj is "+name+" and age is "+age);
	}
	
	public Myclass(int a,String n,String c) {
		this();
		age = a;
		name = n;
		course = c;
		System.out.println("the name of obj is "+name+" and age is "+age+" and he is studing in "+course);
	}
	
	
	static void obj_count() {
		System.out.println("number of object is "+count);
	}
}
