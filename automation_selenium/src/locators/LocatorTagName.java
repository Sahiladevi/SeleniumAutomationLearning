package locators;
/*April 25 2024 - Day7

 * WATS to enter Username using tagName() 
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sahil/Documents/QSPGL-AT-113/HTML_Workspace/HLML_113/tagname.html");
		
		By un = By.tagName("input");
		WebElement element=driver.findElement(un);
		
		Thread.sleep(2000);
		
		element.sendKeys("admin");
		
		Thread.sleep(2000);
		driver.close();
	}
	

}
