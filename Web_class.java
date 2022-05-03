package abstraction;

public class Web_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chorme c1 = new Chorme();
	    c1.open();
        c1.close();
        
        Web w1 = new Chorme();
        w1.open();
        w1.close();
        
        Audi a1 = new Audi();
        a1.start();
        
        BMW b1 = new BMW();
        b1.start();
        
        Car ca = new Audi();
        ca.start();
        
        ca = new BMW();
        ca.start();
	} 

}

class Chorme extends Web{

	@Override
	void open() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+" open the broswer");
		
	}

	@Override
	void close() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+" close the broswer");
	}
	
}

abstract class Web{
   abstract void open();	
   abstract void close();
}

// interfaces 

class Audi implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("the audi car is start");
	}
	
}

class BMW implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("the BMW car is start");
	}
	
}

interface Car{
	void start();
}








