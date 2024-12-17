package week3.day2;

public class Safari extends Edge {

	public void readerMode() {
		System.out.println("Reader mode");
	}
	public void fullScreenMode() {
		System.out.println("Fullscreenmode");
	}
	public static void main(String[] args) {
		Safari obj4=new Safari();
		obj4.openurl();
		obj4.clearCookies();
		obj4.readerMode();
		obj4.fullScreenMode();
		obj4.closeBrowser();
	}
}
