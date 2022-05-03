package encapsulation;

public class Encaps_one {
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.setNum_Bal(13057,44444444);
		acc1.getNum_Bal();
	}
	
	protected void dowork() {
		System.out.println("Encaps_one dowork");
	}
}

class Account{
	
	private int number;
	private int balance;
	
    public void setNum_Bal(int number,int balance) {
    	this.number = number;
    	this.balance = balance;
    }
    
    public void getNum_Bal() {
    	System.out.println("the account number is "+this.number+" and balance is "+this.balance);
    }
    	
}
















