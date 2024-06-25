package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginTestClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://sahiladevi/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		ActiTimeLoginUsingPomDesign login = new ActiTimeLoginUsingPomDesign(driver);
		login.enterUsername("admin");
		login.enterPassword("manager");
		login.selectCheckbox();
		login.clickLoginButton();
		//driver.close();
	}

}
