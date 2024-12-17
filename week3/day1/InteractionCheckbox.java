package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionCheckbox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Check Basic box
		//WebElement basicChk = driver.findElement(By.xpath("//span[text()='Basic']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement basChk = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Basic']")));
		basChk.click();
		boolean bas = basChk.isSelected();
		System.out.println("Is Basic box checked "+bas);
		//Check Ajax box
		WebElement ajax = driver.findElement(By.xpath("//span[text()='Ajax']"));
		ajax.click();
		//setTimeout(function(){debugger;},8000);-used here At console to freeze the msg box
		boolean ajaxSelect = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-c ui-icon-check']")).isSelected();
		if(ajaxSelect) {
		System.out.println("Ajax is selected");
		}
		Thread.sleep(3000);
		String dispTxt = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();		
		System.out.println("The notification Checkbox shows:"+dispTxt);
		//favourite language selected
		driver.findElement(By.xpath("//label[text()='Javascript']")).click();
		//trisstate checked twice
		//WebElement tri1 = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div"));
		WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement tri1 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")));
		tri1.click();
		//WebElement tri2 = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-check']"));
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement tri2 = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ui-chkbox-icon ui-c ui-icon ui-icon-check']")));
		tri2.click();
		//setTimeout(function(){debugger;},8000);-used here too
		WebElement triTxt = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String stateTxt = triTxt.getText();
		WebElement triTxt1 = driver.findElement(By.xpath("//p[text()='State = 2']"));
		String stateTxt1 = triTxt1.getText();
		System.out.println("The tristate is now :"+stateTxt);
		System.out.println("And it's state is :"+stateTxt1);
		Thread.sleep(10000);
			//Toggle button turned on
		WebElement tog = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		tog.click();
		Thread.sleep(5000);
		WebElement togTxt = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String togDisp = togTxt.getText();
		System.out.println("Toggle button is now: "+togDisp);
		//check if box is disabled
		 WebElement enable = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']"));
		boolean chkEnable = enable.isEnabled();
		System.out.println("The checkbox enabled is :"+chkEnable);
		//select multiple option

		WebDriverWait wait4=new WebDriverWait(driver,Duration.ofSeconds(15));	
		WebElement multi = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@data-label='Cities']")));
			multi.click();
			WebDriverWait wait5=new WebDriverWait(driver,Duration.ofSeconds(15));
			WebElement lon = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='London']")));
			lon.click();
	}

}
