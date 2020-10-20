package java1020;

public class MyCalTest {

	public static void main(String[] args) {
		
		MyCalculator mc = new MyCalculator();
		
		int plus = mc.plus(5,7);
		int multiple = mc.multiplication(8,9);
		
		System.out.println(plus);
		System.out.println(multiple);
		
	    Calculator.exec2(3,4);   // interfaceName.methodName(매개변수);
	} 

}
