package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {
private static String text;

public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://leafground.com/alert.xhtml");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.xpath("(//span[text()='S	how'])[2]")).click();
			
	Thread.sleep(3000);
	Alert confirmAlert=driver.switchTo().alert();
	
	String a = confirmAlert.getText();
	System.out.println(a);
	confirmAlert.accept();
}
}
