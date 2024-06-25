package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginTestClass {	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		FacebookLoginPagePomClass loginPage = new FacebookLoginPagePomClass(driver);
		loginPage.enterEmail("admin123@gmail.com");
		loginPage.enterPassword("admin123");
		loginPage.clickOnLogin();
	}
}
