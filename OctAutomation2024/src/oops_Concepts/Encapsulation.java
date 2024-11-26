package oops_Concepts;

 public class Encapsulation {
	
	private int value;
	
	public void SetValue(int x) {
		
		value = x;
	} 
	
	public int getValue() {
		
		return value;
		}
}
     public class MainDemo {
    	 
    	 public static void main(String[]args) {
    		 Encapsulation obj = new Encapsulation();
    		 obj.SetValue(200);
    		 System.out.println(obj.getValue());
    	 }
     }