package week8.day2;

public class LearnFinally {
	
	public static void main(String[] args) {
		int x=10;
		
		int y=0;
		
		
		
		
		try {
			System.out.println(x/y);//10/0
			
		} 
		
//		catch (ArithmeticException e) {
//			if (y==0) {
//				System.out.println(x/1);
//			}	
//		}
//		
		finally {
			System.out.println("Finally code");
		}
		
		
		
		
		
		System.out.println("Done");
	}

}
