package myfirstprogram;

public class UnaryOperator1 {

	public static void main(String[] args) {

		int a =10;
		int b = 20;
		
		System.out.println(a++ + ++b); //10+21=31
		
		System.out.println(++a - --b ); //12-20= 8
		
		System.out.println(a++ + ++a); //12+14=26
	
		System.out.println(--b + b--); //19+19=38
		
		System.out.println(++b - --a); //19-13=6		
	}

}
