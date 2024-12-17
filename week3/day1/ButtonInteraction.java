package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']/parent::button")).click();
	String dash = driver.getTitle();
	System.out.println("You are in now page:"+dash);
	driver.get("https://leafground.com/button.xhtml");
	boolean disButton = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
	if(disButton) {
		System.out.println("The button is Disabled");
	}
	else {
		System.out.println("The button is not Disabled");
		
	}
	Point subLoc = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
	System.out.println("The submit is at Location:"+subLoc);
	String cssValue = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
	System.out.println("Background colour of Save button is"+cssValue);
Dimension subSize = driver.findElement(By.id("j_idt88:j_idt94")).getSize();
System.out.println("The dimension of submit button:"+subSize);
driver.close();



}

}

