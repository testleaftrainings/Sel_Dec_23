package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
		//Declare List
		List<String> mentors = new ArrayList<String>();
		List<String> coach = new ArrayList<String>();
		
		coach.add("Babu Manickam");
		
		// to add items into the List
		mentors.add("Aravind");//0
		mentors.add("Ragu");//1
		mentors.add("Princilla");//2
		mentors.add("Gokul");//4
		mentors.add("Vinoth");//5
		mentors.add(3, "Vineeth");//3
		
		//addAll-> to add all the items of one list to another
		coach.addAll(mentors);
		System.out.println(coach);
		
		coach.removeAll(mentors);
		System.out.println("Remove  All: "+coach);
		
		//to print the list
		System.out.println(mentors);
		
		//to find the size of the list
		int size = mentors.size();
		System.out.println(size);
		System.out.println(mentors.isEmpty());
		
		//to retrieve a particular item from the list
		String mentor = mentors.get(2);
		System.out.println(mentor);
		
		//to remove an element from the list
		mentors.remove(3);
		System.out.println(mentors);
		
		
		
		//to clear the datas from the list
		mentors.clear();
		System.out.println(mentors);
		System.out.println(mentors.isEmpty());
		
		
	}

}
