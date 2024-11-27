package week2.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int[] input= {1,4,3,2,8,6,7};
		Arrays.sort(input);
		System.out.println("Sorted Numbers");
		for(int i=0;i<input.length;i++) {
		System.out.println(input[i]);
		}
		System.out.println("Missing Elements are");
		for(int i=1,j=0;i<=input.length;i++,j++){
					if(i==input[j]){
				continue;}
		else if(i!=input[j]) {
				System.out.println(i);
				j--;
			}
	
		}
	}
}
