package assignmentNo_3;

public class SingleInheritance1 extends SingleInheritance {

	public void Class() {
		System.out.println("this is class method");

		}
	public static void main(String[]args) {
		SingleInheritance1 obj = new SingleInheritance1();
		obj.test();
		obj.Class();
	}
}
