package assignmentNo_2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		
		int Given =num;
		int rev=0;
		while(num!=0) {
			rev= rev*10 + num % 10;
			num=num/10;
			
		}
		if(Given==rev) {
			System.out.println("Palindrome number");
		}else {
			System.out.println("Not a Palindrome Number");
		}

	}

}
