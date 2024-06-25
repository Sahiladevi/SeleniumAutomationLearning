package locators;
/*April25 2024- Day7

 * WATS to enter username and password and check the remember password
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/sahil/Documents/QSPGL-AT-113/HTML_Workspace/HLML_113/sametagname.html");
		
		//enter UserName
		By un = By.tagName("input");
		WebElement element=driver.findElement(un);					
		element.sendKeys("admin");
		
		//enter Password
		By pwd = By.id("pass");
		WebElement elementPwd =driver.findElement(pwd);				
		elementPwd.sendKeys("3456");
		//checkbox
		By checkbox = By.id("check");
		WebElement elementCheck =driver.findElement(checkbox);
		elementCheck.click();
		
		Thread.sleep(2000);
		//clearing the password
		elementPwd.clear();
		
		Thread.sleep(2000);
		driver.close();
	}

}
