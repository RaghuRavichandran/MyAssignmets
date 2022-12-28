package week1.day2Assignment;

public class Palindrome {

	public static void main(String[] args) {
		
		int temp,rev=0,a;
		int num=34343;
		a=num;
		
		for(; num!=0; num=num/10 ) {
		temp= num%10;
		rev= (rev*10)+temp;
		
	}
		if (a==rev) {
		System.out.println(rev+ " is a palindrome");
	}
		else {
		System.out.println(rev+ " is not a palindrome");
	}
	}
	
}

//Check the given number is palindrome or not 

//Int num =34343

//Initialize a  temporary variable.

///Reverse the number (using for loop and add to the temporary variable)

//Compare the temporary number with reversed number

//If both numbers are same, print "palindrome number"

//Else print "not palindrome number