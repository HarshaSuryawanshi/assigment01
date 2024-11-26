package assignmentNo_3;

public class UsingSuperKeyword1 extends UsingSuperKeyword {
	
	public void sub(int a,int b) {
		super.add(a,b);
		int Sub = a-b;
		System.out.println("Substraction of a and b is ="+Sub);
	}

	public static void main(String[] args) {

		UsingSuperKeyword1 abc = new UsingSuperKeyword1();

		abc.sub(50,20);
		
	}

}
