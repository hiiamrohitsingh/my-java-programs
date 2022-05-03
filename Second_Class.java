package learning_java;

public class Second_Class {

	public static void main(String[] args) {
		
		byte bytedata = 127;
		
		long longdata = 99999999999999998l;
		
		learning_java.First_Class obj2 = new First_Class();
		
        System.out.println(obj2.chardata);
        System.out.println(obj2.intdata);
        System.out.println(obj2.floatdata);
        
        
        System.out.println("the byte data " + bytedata);
        System.out.println("the long data " + longdata);
        
        First_Class.i_am_a_static_fun();
	}

}
