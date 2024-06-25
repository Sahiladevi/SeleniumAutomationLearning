package popup_handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUpYatraByFacebook {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");	
		
		//Mouse hover to MyAccount
		WebElement myAccount = driver.findElement(By.xpath("//a[text()='My Account']"));
		WebElement signUp = driver.findElement(By.xpath("//a[@title='Sign Up']"));		
		Actions act = new Actions(driver);
		act.moveToElement(myAccount).pause(Duration.ofMillis(2000)).moveToElement(signUp).click().build().perform();	
		
		Thread.sleep(2000);
		driver.findElement(By.id("fb-login-btn")).click();
		
		//Switching to child frame to click on create account
		
		Set<String> referenceIds = driver.getWindowHandles();
		
		Iterator<String> itr = referenceIds.iterator();
		while(itr.hasNext())
		{
			String reference = itr.next();			
			driver.switchTo().window(reference);
			String title = driver.getTitle();
			if(title.contains("Facebook"))
			{
				driver.findElement(By.linkText("Create new account")).click();
			}
		}
		
		Thread.sleep(4000);		
		driver.quit();
	}

}
