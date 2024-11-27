package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
public static void main(String[] args) {
	// Launchbrowser
	ChromeDriver driver=new ChromeDriver();
	//driver.get("https://www.facebook.com/");
	//load url
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//maximize the browser
	driver.manage().window().maximize();
	
	//Enter username
	//finding element
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
	//Enter Password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	//click login button
	driver.findElement(By.className("decorativesubmit")).click();
}
}
 