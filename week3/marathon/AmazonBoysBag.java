package week3.marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonBoysBag {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//search product
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
				search.sendKeys("Bags for Boys");
				driver.findElement(By.id("nav-search-submit-button")).click();
				Thread.sleep(3000);
//Print No.of.Bags listed
	WebElement totalBagResult = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span"));
		String noOfBags=totalBagResult.getText();
		System.out.println("Total no.of Bags results:"+noOfBags);
	//filter by bag brand=safari n Skybags	
		driver.findElement(By.xpath("//a[@aria-label='Apply the filter Safari to narrow results']/div")).click();
	    driver.findElement(By.xpath("//a[@aria-label='Apply the filter Skybags to narrow results']/div")).click();
	  //sort by Newest arrivals 
	  WebElement sortDropDown = driver.findElement(By.xpath("//span[text()='Sort by:']"));
	    sortDropDown.click();
	  driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	   //select the first listed bag
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(30));
	 WebElement prod1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-asin='B0DKJPNBJN']//a")));
	   prod1.click();
	    Set<String> allWindows = driver.getWindowHandles();
	   List<String> allAddress=new ArrayList<String>(allWindows);
	    driver.switchTo().window(allAddress.get(1));
	    Thread.sleep(3000);
	    WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement prodName = wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='titleBlockRightSection']")));
	    String skybag = prodName.getText();
	    System.out.println(skybag);
	    
	    WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement price = wait3.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='agsIfdInsidePrice_feature_div']/preceding::span[@aria-hidden='true'][1]")));
	    		String price1 = price.getText();
	    		driver.close();
System.out.println("Discounted Price:"+price1);
WebElement title2 = driver.findElement(By.xpath("//option[@value='search-alias=fashion']"));
String title2txt = title2.getText();
System.out.println("Page Title:"+title2txt);
	
	}

}
