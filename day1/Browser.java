package week2.day1;

public class Browser {
public String launchBrowser(String browserName) {
	System.out.println("Browser launched successfully");
	return browserName;
}
public void loadUrl() {
System.out.println("Application Url loaded successfully");	
}
 

public static void main(String[] args) {
	Browser obj1=new Browser();
	obj1.launchBrowser("Chrome");
	obj1.loadUrl();
	
	}
}