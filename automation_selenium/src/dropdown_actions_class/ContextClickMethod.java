package dropdown_actions_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickMethod {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");

		Thread.sleep(4000);
		WebElement  rightClickElement = driver.findElement(By.xpath("//span[text()='Domestic Flights']"));
		Actions act = new Actions(driver);
		act.pause(Duration.ofMillis(2000)).perform();
	
		driver.findElement(By.xpath("//button[text()='Ok,I Agree']")).click();
		act.contextClick(rightClickElement).perform();		
		//Context menu options handling
		
		Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_T); //open in new tab
		r.keyPress(KeyEvent.VK_D); //open in new window
	}

}
