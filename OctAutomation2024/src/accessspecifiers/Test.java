package accessspecifiers;
 class Test {
	 public int a=5;
	 protected int b=10;
	 int c=15;
	 private int d=20;
	 
	 public void test() {
		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(c);
		  System.out.println(d);
	 }
        public class Am {
        	
		public static void main(String[] args) {
			Test obj = new Test();
		    // obj.test();
			System.out.println(obj.a);
			System.out.println(obj.b);
			System.out.println(obj.c);
			System.out.println(obj.d);
		
		}
	}
}
