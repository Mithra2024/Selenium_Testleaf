package week1.day2;

public class Palindromecheck {
	public static void main(String[] args) {
		int rem=0,sum=0;
		int input=15233251;
		int output=0;
		int numofdigits=8;
		//creating a loop to reverse the input
		for(int i=input;i>=1;i=i/10) {
			rem=i%10;
		//stacking the number in reversal order	
		for(int j=1;j<numofdigits;j++) {
			rem=rem*10;
		}
		numofdigits--;
		sum=sum+rem;
		}
		output=sum;
		//checking the reversed number is palindrome or not
		if(input==output) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not palindrome");
		}
	}

}
