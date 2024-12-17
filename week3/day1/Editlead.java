package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Editlead {
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
	//navigate to edit lead page
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
	driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Infosys");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Durga");
	driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("cafe");
	driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("local");
	driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Hotel");
	driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Fine dining");
	driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("durga.cafe@gmail.com");
	WebElement stateDrop = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select stateMenu=new Select(stateDrop);
	stateMenu.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
	driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("very Important");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	String title = driver.getTitle();
	System.out.println("Title of page:"+title);
	driver.close();
	
	
		}

}
