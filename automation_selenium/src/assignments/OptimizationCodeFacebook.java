package assignments;
/*WATS to perform following action in facebook application
 * Enter Username
 * Clear Username text
 * Enter new text
 * Enter password 
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OptimizationCodeFacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Optimization code:1 
		WebElement userName =driver.findElement(By.id("email"));
		userName.sendKeys("sita_raman123@gmail.com");
		
		Thread.sleep(2000);
		userName.clear();
		
		Thread.sleep(2000);
		userName.sendKeys("Nimu123@gmail.com");
		
		////Optimization code:2
		driver.findElement(By.id("pass")).sendKeys("sita_raman123");;
		
		Thread.sleep(2000);
		driver.close();	
	}
}
