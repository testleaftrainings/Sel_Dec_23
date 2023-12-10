package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		//  datatype[] variable = {values}
		//index       0  1   2  3  4
		int[] scores={90,98,89,96,95};

		//to find the length of an array
		int totalLen = scores.length;
		System.out.println("The total Length of the array is :"+totalLen);

		//to retrieve a single element out of an array
		System.out.println("Single value is: " +scores[3]);
		
		//to sort an array
		Arrays.sort(scores);
		System.out.println("The min value is :"+scores[0]);
		
		//the max value
		System.out.println("The max value is: "+scores[totalLen-1]);//scores[5-1]->scores[4]
		

		//to print all values in an array
		for (int i = 0; i < totalLen; i++) {//i=5; 5<5->t; 
			System.out.println(scores[i]);//scores[5]=?
		}


	}

}
