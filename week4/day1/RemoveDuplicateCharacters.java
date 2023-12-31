package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String str =  "google";
		//output=gole
		//convert string to charArray
		char[] ch = str.toCharArray();
		//Declare a Set
		Set<Character> unique = new LinkedHashSet<Character>();
		//Iterate through the loop
		for (int i = 0; i < ch.length; i++) {
			unique.add(ch[i]);	
		}
		String output = "";
		for (Character each : unique) {
			output=output+each;
		}
		System.out.println(output);

	}

}
