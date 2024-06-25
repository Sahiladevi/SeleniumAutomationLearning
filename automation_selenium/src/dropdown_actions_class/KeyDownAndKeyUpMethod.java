package dropdown_actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownAndKeyUpMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		//Entering the text in upper case in email field
		act.keyDown(Keys.SHIFT).perform();
		act.sendKeys(email,"admin").perform();
		//to release the performed keystroke
		act.keyUp(Keys.SHIFT).perform();
		Thread.sleep(2000);
		email.clear();
		//again passing value to the email field
		act.sendKeys(email,"manager").perform();
	}

}
