package week4.day1Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int val=arr[0];
		
		List<Integer> lst=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			lst.add(arr[i]);
		}
		Collections.sort(lst);
		System.out.println(lst);
		for (int i = 0; i < lst.size(); i++) {
			if (val==lst.get(i)) {
				val++;
			}
			else {
				System.out.println(val);
				break;
			}
		}
	}
}
/* int[] arr = {1,2,3,4,7,6,8};

		// Sort the array	
		

		// loop through the array (start i from arr[0] till the length of the array)

			// check if the iterator variable is not equal to the array values respectively
			
				// print the number
				
				// once printed break the iteration
				 */