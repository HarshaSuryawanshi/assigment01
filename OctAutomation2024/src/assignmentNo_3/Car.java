package assignmentNo_3;

public class Car extends Vehical{

	public static void main(String[] args) {
		Car ab = new Car();
		ab.drive();
	
	}
                 //Define a Drive Method
	public void drive() {
		 //Calling Vehicle class
		super.drive();
		System.out.println("Reparing a car");
	}
}
