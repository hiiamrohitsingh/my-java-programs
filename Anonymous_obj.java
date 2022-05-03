package basic_concepts;

public class Anonymous_obj {

	public static void main(String[] args) {
		new Pqr().show();
	}

}

class Pqr{
	public int k;
	public void show() {
		System.out.println("show in a");
		System.out.println(k);
	}
}
