package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement userName =driver.findElement(By.id("email"));
		userName.sendKeys("sita_raman123@gmail.com");
		
		WebElement password =driver.findElement(By.id("pass"));
		password.sendKeys("sita_raman123");			
		
		Thread.sleep(2000);
		driver.close();	
		
	}

}
