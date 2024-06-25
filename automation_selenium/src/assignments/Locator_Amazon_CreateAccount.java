package assignments;
/*April 26 2024 - Day8
 * WATS to create account in Amazon.in
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Amazon_CreateAccount {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
		signInLink.click();
		
		WebElement createYourAccount = driver.findElement(By.id("createAccountSubmit"));
		createYourAccount.click();
		
		WebElement enterName = driver.findElement(By.id("ap_customer_name"));
		enterName.sendKeys("Sahiladevi Deenadayalu");
		
		WebElement enterMobileNumber = driver.findElement(By.id("ap_phone_number"));
		enterMobileNumber.sendKeys("9884837579");
		
		WebElement enterPassword = driver.findElement(By.id("ap_password"));
		enterPassword.sendKeys("SahiUS@123");
		
		WebElement verifyMobileNumber = driver.findElement(By.id("continue"));
		verifyMobileNumber.click();
		
		Thread.sleep(2000);
		driver.close();
	}
}
