package week1.day2;

public class LearnBreakStatements {

	public static void main(String[] args) {
		
		//print numbers from 1 to 10;
		//When you find number as 3 print in words and stop the iteration
		
		for (int i = 1; i <= 10; i++) {
			if(i==3) {
				System.out.println("Three");
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Out of the loop");

	}

}
