package week3.day2;

public class Chrome extends Browser {
	
	public void openincognito() {
		System.out.println("openincognito");
	}
	public void clearCache() {
		System.out.println("ClearCache");
	}
public static void main(String[] args) {
	Chrome obj2= new Chrome();
			obj2.openurl();
	obj2.closeBrowser();
	obj2.navigateBack();
	obj2.openincognito();
	obj2.clearCache();
}
	
}
