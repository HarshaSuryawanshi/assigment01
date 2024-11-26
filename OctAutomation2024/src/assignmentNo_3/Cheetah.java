package assignmentNo_3;

public class Cheetah  extends Animal_Cheetah{
	
	public void move() {
		super.move();
		System.out.println("The Cheetah runs");
		
	}

	public static void main(String[] args) {
		Cheetah ch = new Cheetah();
		ch.move();
		 
	}

}
