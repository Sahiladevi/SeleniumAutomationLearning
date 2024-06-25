package locators;

/*April 29 2024 - Day 9
 * WATS to click on Forgot password link in facebook ap * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Link_Facebook_ForgotPassword {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//linkText Locator
		
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(2000);
		driver.close();	
		
	}

}
