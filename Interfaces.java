package basic_concepts;

public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating a object of Con_class class
		
		Con_class obj = new Con_class();
		obj.show();
		obj.display();
		
		// creating a reference of Kon
		
		Kon ref_obj = new Con_class();
		ref_obj.show();
		ref_obj.display();
		
		Kon ref_2_obj = new Kon() {
			public void show() {
				System.out.println("this is kon class show method");
			}
			public void display() {
				System.out.println("this is kon class disply method");
				
			}
		};
		
		ref_2_obj.show();
		ref_2_obj.display();
	}

}

interface Kon{
	void show();
	void display();
}

class Con_class implements Kon{
	public void show() {
		System.out.println("this is con class show method");
	}
	public void display() {
		System.out.println("this is con class display method");
	}
}