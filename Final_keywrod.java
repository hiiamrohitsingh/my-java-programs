package basic_concepts;

public class Final_keywrod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final int abc = 44;
        System.out.println(abc);
        
        XYZ obj_1 = new XYZ();
        obj_1.show();
        
        ABC obj2 = new ABC();
        obj2.show();
	}

}

// final class can not be inherit

// final method can not be override

class XYZ{
	public void show() {
		System.out.println("XYZ show");
	}
}

class ABC extends XYZ{
	public void show() {
		System.out.println("ABC show");
	}
}
