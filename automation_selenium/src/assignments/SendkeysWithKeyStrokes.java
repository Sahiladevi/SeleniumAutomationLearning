package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysWithKeyStrokes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//Identifying the username text field element 
		WebElement userName =driver.findElement(By.id("email"));

		//Entering the Value into the userName
		userName.sendKeys("ChandraBose");

		//selecting the value of userName using Keys Enum
		userName.sendKeys(Keys.CONTROL+"a");

		//copying the value of userName using Keys Enum
		userName.sendKeys(Keys.CONTROL+"c");

		//Moving to next text field password using tab keys
		userName.sendKeys(Keys.TAB,Keys.CONTROL+"v");

		//To verify whether value of userName copied to the password field
		//Inspecting the hidden eye symbol
		driver.findElement(By.className("_9lsb")).click();	

		Thread.sleep(2000);
		driver.close();
	}

}
