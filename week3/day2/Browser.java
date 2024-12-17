package week3.day2;

public class Browser {
	String browserName = "Chrome";
	int browserVersion;
	public void  openurl() {
		System.out.println("launch browser");
	}
	public void closeBrowser() {
		System.out.println("Close browser");
	}
	public void navigateBack() {
		System.out.println("goback");
	}
	
	public static void main(String[] args) {
		Browser obj1=new Browser();
		obj1.openurl();
		obj1.closeBrowser();
		obj1.navigateBack();
	}
	}
	
