package assignment01;

public class IfElse_OldYoung {

	public static void main(String[] args) {

	 int a= 25;
	 int b= 58;
	 int c= 72;
		
		if( a>b && a>c) {
			System.out.println("a is old");
		}
		else if(b>a && b>c) {
			System.out.println("b is old");
		}else {
			System.out.println("c is old");
		}
	if( a<b && a<c ) {
		System.out.println("a is young");
	}else if( b<a && b<c ) {
		System.out.println("b is young");
		}else {
			System.out.println("c is young");
		}
	}

}
