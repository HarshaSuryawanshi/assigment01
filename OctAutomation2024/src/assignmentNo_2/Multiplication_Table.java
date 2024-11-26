package assignmentNo_2;

import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number");
          int a=sc.nextInt();
		for(int i=0; i<=10; i++) {
			System.out.println(a*i);
		}
		
	}

}
