package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_AmazonUS_CreateAccount {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");	
		WebElement signInLink = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		signInLink.click();
		
		
		
	}
}
