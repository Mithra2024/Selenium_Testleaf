package week2.day2;

import java.util.Arrays;

public class PrintDuplicates {
	public static void main(String[] args) {
		int[] num= {2,5,7,7,5,9,2,3};
    	int lengthOfArray=num.length;
	Arrays.sort(num);
	//print sorted array
	System.out.println("Sorted numbers");
	for(int i=0;i<lengthOfArray;i++) {
	System.out.println(num[i]);
	}
	//Compare values
	System.out.println("Duplicate values in Array are");
	for(int i=0;i<lengthOfArray-1;i++) {
			if(num[i]==num[i+1]) {
			System.out.println(num[i]);
		}
	}
			
  }
}
	
	

