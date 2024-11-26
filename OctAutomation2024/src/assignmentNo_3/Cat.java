package assignmentNo_3;

public class Cat extends Animal {
	public void MakeSound() {
		super.MakeSound();
		System.out.println("bark");
	}
	public static void main(String[] args) {
		Cat ab = new Cat();
		ab.MakeSound();
		
	}
}
