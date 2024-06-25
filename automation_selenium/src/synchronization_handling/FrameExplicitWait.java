package synchronization_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\mainiframe.html");
		driver.findElement(By.id("user")).sendKeys("Sita");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		//Condition --> frame should be available and switch it to it
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		//enter Password
		driver.findElement(By.id("pass")).sendKeys("Sita123");
		driver.findElement(By.id("email")).sendKeys("Sita123@gmail.com");
		
		//Again switch back to parent frame		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("number")).sendKeys("34567");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();				
	}

}
