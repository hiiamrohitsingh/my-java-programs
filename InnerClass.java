package Learning_about_java_classes;

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		// to access the inner class first i need to create object of outter class 
		
		Outter out_obj = new Outter();

		out_obj in_obj = new Outter.Inner();
		
	}

}


class Outter{
	int x;
	
	// inner class 
	public class Inner{
		int get_otter_fileds() {
			return x;
		}
	}
	
}