package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//div[contains(text(),' number or email')]/following-sibling::input[@name='reg_email__']"));
		email.sendKeys("sita@gmail.com");
		Thread.sleep(5000);
		WebElement confirmEmail = driver.findElement(By.name("reg_email_confirmation__"));
		boolean confirmValue = confirmEmail.isDisplayed();
		
		if (confirmValue) {
			System.out.println("Re-enter email web element is displayed on the web page");
			
		} else {
			System.out.println("Re-enter email web element is not displayed on the web page");

		}	
		
		Thread.sleep(2000);
		driver.close();
		
	}
}
