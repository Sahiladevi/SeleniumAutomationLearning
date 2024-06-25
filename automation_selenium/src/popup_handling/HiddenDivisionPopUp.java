package popup_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.abhibus.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Thread.sleep(2000);
		//Click on Login button
		driver.findElement(By.xpath("//span[text()='Login/SignUp']")).click();
		Thread.sleep(2000);
		//click on alert popup -signin with google
		driver.findElement(By.xpath("//span[text()='Sign in with google']")).click();
		Thread.sleep(2000);
		driver.quit();		
	}

}
