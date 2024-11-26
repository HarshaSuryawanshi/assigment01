package oops_Concepts;

public class MethodOverloading {
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[]args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum(10, 20);
		obj.sum(20, 50, 10);
	
	}
}
