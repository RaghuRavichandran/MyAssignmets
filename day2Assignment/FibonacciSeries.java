package week1.day2Assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8,firstNum=0,secNum=1,sum;
		
		for (int i = 1; i <=range; i++ ) {
			System.out.print(firstNum+ ", ");
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;	
		}
	}
}
