package week1.day2Assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		int  num=13;
		boolean flag= false;
				
		for (int i = 2; i <=num/2; i++) {
			
			if (num%i==0) {
				flag= true;
				break;
			}
		}
		
		if (flag!=true) {
			System.out.println(num+ " is a Prime Number");
		}
		
		else {
			System.out.println(num+ " is not a Prime Number");
		}
	}	
}
//*Goal: To find whether a number is a Prime number or not

	// * input: 13
	// * output: 13 is a Prime Number
	 
	// * Shortcuts:
	// * 1) Print : type: syso, followed by: ctrl + space + enter
	 //* 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	// * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	    
	// * What are my learnings from this code?
	// * 1)
	// * 2)
	// * 3) 
	 
	 

	

	//public static void main(String[] args) {



		// Declare an int Input and assign a value 13

		

		// Declare a boolean variable flag as false

		

		// Iterate from 2 to half of the input

		//Divide the input with each for loop variable and check the remainder



			// Set the flag as true when there is no remainder

				
			// break the iterator


		// Check the flag (Provide a condition)

		

			// Print 'Prime' when the condition matches

			

			// Print 'Not a Prime' when the condition doesn't match 

