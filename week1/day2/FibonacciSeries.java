package week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {
	int n=0,p=0,q=0;
	for (int i=0;i<8;i++) {
		if(i<=1) {
			System.out.println(i);
		}
			else if(i==2) {
			 n=i-1;
			 p=i-2;
			 q=n+p;
			 System.out.println(q);
			}
			else {
				p=n;
				n=q;
				q=n+p;
				System.out.println(q);
			}
				
    	}
  }	
}

