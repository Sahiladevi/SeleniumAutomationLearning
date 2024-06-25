package locators;
/*
 * April 25 2024 - Day 7
 * Duplicate tagName --> findElement will perform action on first matching element 
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTwoTagName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sahil/Documents/QSPGL-AT-113/HTML_Workspace/HLML_113/sametagname.html");
		
		By un = By.tagName("input");
		WebElement element=driver.findElement(un);		
		Thread.sleep(2000);		
		element.sendKeys("admin");
		Thread.sleep(2000);	
		By pwd = By.tagName("input");
		WebElement elementPwd =driver.findElement(pwd);
		elementPwd.sendKeys("3456");
		
		
		Thread.sleep(2000);
		driver.close();
	}
}
