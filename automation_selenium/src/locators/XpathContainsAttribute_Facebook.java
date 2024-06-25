package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsAttribute_Facebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sahiladevi2003@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("psalm121");
		
		driver.findElement(By.xpath("//button[contains(@id,'u_0_')]")).click();
		
		driver.close();	
		
	}

}
