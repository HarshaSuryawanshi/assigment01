package oops_Concepts;

public class MainClassYZ implements Z{

	public static void main(String[] args) {

		MainClassYZ obj = new MainClassYZ();
		obj.a();
		obj.b();
	}

	@Override
	public void a() {
           System.out.println("A Method from y interface");
	}

	@Override
	public void b() {
		System.out.println("B method for Z interface");
	}

}
