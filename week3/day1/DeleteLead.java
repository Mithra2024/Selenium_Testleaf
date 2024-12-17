package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
public static void main(String[] args) {
//launch browser
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	//login
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
//navigate to find lead page
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
//Enter the phone area code of the lead to be deleted
driver.findElement(By.xpath("//span[text()='Phone']")).click();
driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("000");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
driver.findElement(By.xpath("//a[text()='10938']")).click();
driver.findElement(By.xpath("//a[text()='Delete']")).click();
//Again navigate to find leads page
driver.findElement(By.xpath("//a[text()='Find Leads']"));
//Check if the record deleted is present and print desirable result 
WebElement dis = driver.findElement(By.xpath("//div[text()='No records to display']"));
String disTxt = dis.getText();
if(disTxt.equals("No records to display")){
	System.out.println("The record is deleted");
}
else {
	System.out.println("The record is present");
}
	driver.close();
}

}

