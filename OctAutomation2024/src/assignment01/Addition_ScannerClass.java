package assignment01;

import java.util.Scanner;

public class Addition_ScannerClass {
 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st value");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter 2nd value");
		  int b= sc.nextInt();
		  
		 int sum = a + b;
		  System.out.println("sum of two number is =" + sum);
	}

}
