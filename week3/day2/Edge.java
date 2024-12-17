package week3.day2;

public class Edge extends  Browser {
	
	public void takeSnap() {
		System.out.println("takeSnap");
	}
	public void clearCookies() {
		System.out.println("clearcookies");
	}
 public static void main(String[] args) {
	Edge obj3=new Edge();
	obj3.takeSnap();
	obj3.clearCookies();
	
}
}
