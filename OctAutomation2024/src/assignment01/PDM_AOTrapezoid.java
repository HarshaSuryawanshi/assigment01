package assignment01;

public class PDM_AOTrapezoid {

	public static void main(String[] args) {
		PDM_AOTrapezoid pt = new PDM_AOTrapezoid();
		pt.aot();
	}
  public void aot()
	{
    int a = 7;
	int b = 9;
	int h = 5;
	int aot= ((a+b)/2)*h;
System.out.println("Area of Trapezoid is = " + aot);
}
}
