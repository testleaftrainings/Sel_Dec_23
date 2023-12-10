package week1.day2;

public class LearnIFCondition {

	public static void main(String[] args) {
		
		int number = 20;
		//Check whether the given number is positive or negative or neutral
		
		//type if-> ctrl+space->enter
		
		if (number>0) {//if(0>0) -> false
			System.out.println("The number is positive");
		} 
		else if(number<0) { // if(0<0) -> false
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is neutral");
		}
		

	}

}
