package week4.day1;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {
	
	public static void main(String[] args) {
		int[] nums  = {2,5,2,4,3,5,7,4,8,7};
		//output = {2,4,5,7};
		Set<Integer> unique = new TreeSet<Integer>();
		Set<Integer> duplicates = new TreeSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			boolean add = unique.add(nums[i]);
			if (!add) {
				duplicates.add(nums[i]);
			}
					
		}
		System.out.println(duplicates);
		
	}

}
