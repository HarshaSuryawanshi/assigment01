package oops_Concepts;

public class MethodOverriding1 extends MethodOverriding {

	public void eat() { 
		 //we are using super keyword to call the parents class Method 
		super.eat();
		System.out.println("You are Eating");
	}
	
	public static void main(String[]args) {
		MethodOverriding1 abc = new MethodOverriding1();
		abc.eat();
	}
}
