package assignment01;

public class IfElse_LargestNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 28;
		int c = 25; 
		
		if( a>b && a>c) {
			System.out.println("a is Greater");
		}else if(b>a && b>c) {
			System.out.println("b is Greater");
		}else {
			System.out.println("c is Greater");
		}
	}

}
