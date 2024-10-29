package assignment01;

public class PDClass_Smp_Interest {

	public static void main(String[] args) {
         
		PDClass_Smp_Interest psi = new PDClass_Smp_Interest();
		 psi.mult();
	} 
	public void mult() {
	  int p = 1000;
	  int R = 5;
	  int T = 2;
	  int si = (p*R*T)/100;
	  System.out.println("Simple Interest is =" + si);}
	

}
