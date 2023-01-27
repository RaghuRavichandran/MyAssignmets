package week4.day1Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String a="";
		String[] split = text.split(" ");
		for (int i = 0; i < split.length; i++) {
			//System.out.println(split[i]);
		}
		Set<String> unique=new LinkedHashSet<String>();
		for (int i = 0; i < split.length; i++) {
			if (!unique.add(split[i])) {
				a=split[i];
			}
		}
		unique.remove(a);
		System.out.println(unique);
	}
}
/* a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words */