package assignment01;

public class IfElse_TallestStudent {

	public static void main(String[] args) {

		int amit = 180;
		int atul = 128;
		int c = 618; 
		
		if( amit>atul && amit>c) {
			System.out.println("amit is Taller");
		}else if(atul>amit && atul>c) {
			System.out.println("atul is Taller");
		}else {
			System.out.println("c is Taller");
		}
	}

}
