package basic_concepts;

public class Bit_wise_and_or {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bitwise operator -> AND (&), OR (|)
		
		// & 1 1 -> 1 else 0 -----------------------------------------------
		
		int a = 25; //1 1 0 0 1
		int b = 15; //0 1 1 1 1
		            //0 1 0 0 1 -> 9
		
	    int c = a & b;
	    
	    System.out.println(c);
	    
	    a = 255; //11111111
		b = 155; //10011011
		         //10011011 -> 155
		
	    c = a & b;
	    
	    System.out.println(c);
	    
	    // | ---------------------------------------------------------------------
	    
	    // | 1 1 -> 1
	    // | 1 0 -> 1
	    // | 0 1 -> 1
	    // | 0 0 -> 0
	    
	    int x = 34; //100010
	    int y = 45; //101101
	                //101111 -> 47
	    
	    int z = x | y;
	    
	    System.out.println(z);
	    
	}
	

}
