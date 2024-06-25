package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_LinkText_PartialLinkText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\linktext_partialtext.html");
		
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("gin")).click();
		
		Thread.sleep(2000);
		driver.close();	
	}
}
