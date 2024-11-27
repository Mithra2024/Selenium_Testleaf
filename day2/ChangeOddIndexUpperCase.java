package week2.day2;

public class ChangeOddIndexUpperCase {
	public static void main(String[] args) {
		String r1=new String("changeme");
		char[] r2=r1.toCharArray();
		for(int i=0;i<r2.length;i++) {
			if(i%2==1) {
				String ss=r1.toUpperCase();
				r2[i]=ss.charAt(i);
			}
			else
				continue;
		}
		//String ss=r1.substring(1,6).toUpperCase();
		System.out.println(r2);
	}
}
