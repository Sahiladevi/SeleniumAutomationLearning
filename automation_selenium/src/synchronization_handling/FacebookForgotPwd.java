package synchronization_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookForgotPwd {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("Sita@gmail.com");
		driver.findElement(By.id("did_submit")).submit();
		driver.close();
	}
}
