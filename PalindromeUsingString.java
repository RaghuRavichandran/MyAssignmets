package week3.day2Assignment;


public class PalindromeUsingString {

	public static void main(String[] args) {
		String name="madam";
		String rev="";
		char[] charArray = name.toCharArray();
		for (int i = charArray.length-1; i>=0 ; i--) {
		char c=charArray[i];
		rev=rev+c;
		
		}
		if (name.equals(rev)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is not a Palindrome");
		}
	
	}
}
//a) Declare A String value as"madam"

//* b) Declare another String rev value as ""
//* c) Iterate over the String in reverse order
// d) Add the char into rev
// e) Compare the original String with the reversed String, if it is same then print palinDrome 

 //Hint: Use .equals or .equalsIgnoreCase when you compare a String 