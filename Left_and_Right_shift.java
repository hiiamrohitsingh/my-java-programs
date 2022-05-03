package basic_concepts;

public class Left_and_Right_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// left shit << and right shift >>
		
		int a = 8; // 1 0 0 0
		int b = a << 2; // (8) 1000 append 2 more bits -> 100000 -> 32
		
		System.out.println(b);
		
		int c = b >> 2; // 100000 -> 1000.00
		
		System.out.println(c);
	}

}
