package week2.day2;

import java.util.Arrays;

public class FindAnagram {
public static void main(String[] args) {
String a=new String("tesla");
String b=new String("laast");
char[] a1=a.toCharArray();
char[] b1=b.toCharArray();
Arrays.sort(a1);
char[] a2=a1;
System.out.println(a2);

Arrays.sort(b1);
char[] b2=b1;
System.out.println(b2);
if(a2.length==b2.length) {
for(int i=0;i<a2.length;i++) {
	if(a2[i]==b2[i]) {
		if(i==a2.length-1) {
			System.out.println("Given Strings are anagram");
		}
		continue;
	}
	else  {
		System.out.println(" The given strings are not an Anagram");
		break;
	}
}
}
else {
	System.out.println("Length doesnt match, so the strings are not anagram");
}
}
}