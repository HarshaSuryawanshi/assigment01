package assignmentNo_3;

public class Multilevel3 extends Multilevel2 {
	public void fourth() {
		System.out.println("This is Fourth Method");
	}

	public static void main(String[] args) {

		Multilevel3 ab= new Multilevel3();
		ab.first();
		ab.Second();
		ab.Third();
		ab.fourth();
	}

}
