package week3.day4;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		
String companyName="google";
char[] cn=companyName.toCharArray();
Set<Character> uniqueChar=new LinkedHashSet<>();

for (int i=0;i<cn.length;i++) {
	uniqueChar.add(cn[i]);
	
}
System.out.println(uniqueChar);
}
}