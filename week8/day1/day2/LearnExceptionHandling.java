package week8.day2;

public class LearnExceptionHandling {
	
	public static void main(String[] args) {
		int x=10;
		
		int y=5;
		
		int[] nums = {10,20,30};//indices 0,1,2
		
		
		try {
			System.out.println(x/y);//10/0
			System.out.println(nums[3]);
		} 
		
		catch (ArithmeticException e) {
			if (y==0) {
				System.out.println(x/1);
			}	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		System.out.println("Done");
	}

}
