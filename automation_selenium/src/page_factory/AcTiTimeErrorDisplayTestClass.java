package page_factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcTiTimeErrorDisplayTestClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://sahiladevi/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		ActiTimeErrorMessagePageFactory actiLogin = new ActiTimeErrorMessagePageFactory(driver);
		actiLogin.login("adm", "manager");
		actiLogin.errorMsg();	
		driver.close();
	}
}
