package iframe_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\mainiframe.html");
		driver.findElement(By.id("user")).sendKeys("Sita");
		//Approach1: frame index number
		//driver.switchTo().frame(0);
		//Approach 2: id/name value - String value
		//driver.switchTo().frame("q");
		WebElement frameElement =driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.id("pass")).sendKeys("Sita123");
		driver.findElement(By.id("email")).sendKeys("Sita123@gmail.com");
		
		//Again switch back to parent frame
		
		driver.switchTo().parentFrame();
		driver.findElement(By.id("number")).sendKeys("34567");
		
		
	}

}
