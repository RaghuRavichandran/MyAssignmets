package week1.day2Assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int val=0;
		Arrays.sort(arr);
		val=arr[0];
		
		for (int i = 0; i <=arr.length; i++){
			if (val==arr[i]) {
				val++;
			}
			else {
				System.out.println(val);
				break;
			}
		}
		
	}
}
//Here is the input
	//int[] arr = {1,2,3,4,7,6,8};

	// Sort the array	
		

// loop through the array (start i from arr[0] till the length of the array)

// check if the iterator variable is not equal to the array values respectively
			
// print the number
				
// once printed break the iteration