package week3.marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pvrcinemas {
	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//load URL
		driver.get("https://www.pvrcinemas.com/");
		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		String pvrTitle = driver.getTitle();
		System.out.println("Title of page is:" +pvrTitle);
		//Select Cinemas under Quickbook
		driver.findElement(By.className("cinemas-inactive")).click();
		
		//select cinema dropdown
		//Thread.sleep(3000);
		WebElement cinemaDropdown=driver.findElement(By.id("cinema"));
		cinemaDropdown.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 Actions mouseOver=new Actions(driver);
		 
		  WebElement pvrCine = driver.findElement(By.xpath("//span[contains(text(),'Marina')]"));
		  mouseOver.moveToElement(pvrCine).perform();
			 pvrCine.click();
			 
			 
		 WebElement pvrDate = driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]"));
		 mouseOver.moveToElement(pvrDate).perform();
		 pvrDate.click();
     

         WebElement pvrMovie = driver.findElement(By.xpath("//span[contains(text(),'PUSH')]"));
         mouseOver.moveToElement(pvrMovie).perform();
         WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
         WebElement Movie = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'ATMOS')]")));
         Movie.click();

         Actions scrollDown=new Actions(driver);
         WebElement refreshPage = driver.findElement(By.xpath("//span[contains(text(),'PUSH')]"));
         scrollDown.scrollToElement(refreshPage).click();
 		 
         //mouseOver.moveToElement(Page2Movie).perform();
         //WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(3));
         //WebElement movie1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'ATMOS')]")));
         
 		 WebElement pvrTime = driver.findElement(By.xpath("//span[contains(text(),'ATMOS')]"));
         mouseOver.moveToElement(pvrTime).perform();
		 pvrTime.click();
		 Thread.sleep(2000);
		 
		 WebElement book = driver.findElement(By.xpath("//span[text()='BOOK']"));
		 book.click();
               //driver.close();
          
          
	}

	private static void selectElementFromList(List<WebElement> cineList, String string) {
		// TODO Auto-generated method stub
		
	}

	private static void selectFromList(List<WebElement> cineList, String string) {
		// TODO Auto-generated method stub
		
	}
}