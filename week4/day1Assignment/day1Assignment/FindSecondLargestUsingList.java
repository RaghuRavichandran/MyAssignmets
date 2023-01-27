package week4.day1Assignment;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class FindSecondLargestUsingList {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		List<Integer> lst=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			lst.add(data[i]);
		}
		Collections.sort(lst);
		System.out.println(lst);
		int size = lst.size();
		System.out.println("Second Largest number in the list is "+lst.get(size-2));	
	}		
}
/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */ 