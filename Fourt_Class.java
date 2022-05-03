package learning_java;

import encapsulation.Encaps_one;

public class Fourt_Class {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.walk();
	    p1.eat();
	    
	    Person p2 = new Person("Rohit",21);
	    p2.eat("egg");
	    p2.walk();
	    
	    Student s1 = new Student("Radhika",20);
	    Student s2 = new Student();
	    
	    Person.count_person();
	    
//	    Encaps_one eo2 = new Encaps_one();
//	    eo2.dowork();
	    
	    Outpackage op1 = new Outpackage();
	}

}

class Outpackage extends Encaps_one{
	public Outpackage() {
		System.out.println("Encaps_one child class");
		dowork();
	}
}

class Student extends Person{
	
	public Student() {
		super();
	}
	
	public Student(String n,int a) {
		super(n,a);
	}
}

class Person{
	
	static int count=0;
	
	String name;
	int age;
	
	public Person() {
		count++;
		System.out.println("the person object is created of "+this.getClass());
	}
	
	public Person(String n,int a){
		this();
		name = n;
		age = a;
		System.out.println("person name is "+name+" and age is "+age);
	}
	
	static void count_person() {
        System.out.println(count+" persons has been created");		
	}
	
	public void walk() {
		System.out.println("the person is walking");
	}
	
	public void eat() {
		System.out.println("the person is eating");
	}
	
	public void eat(String food) {
		System.out.println(this.name+" is eating "+food);
	}
}

	
	
	
	
	
	
	