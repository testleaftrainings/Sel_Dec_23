package week3.day1;

public class Calculator {

	public void add() {
		int a=10;
		int b=2;
		System.out.println(a+b);

	}

	public void add(int c, int d) {
		System.out.println("Addition of two numbers with int type:");
		System.out.println(c+d);     		

	}

	public void add(int a, float b) {
		System.out.println(a+b);     		

	}

	public void add(float a, int b) {
		System.out.println("Addition of two numbers with float type:");
		System.out.println(a+b);     		

	}

	public void add(float a, int b, int c) {
		System.out.println("Addition of three numbers:");
		System.out.println(a+b+c);     		

	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(2.3f, 30, 40);
		calc.add(30, 56);
		calc.add();
	}
	
	


}
