package dropdown_actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		//Approach:1
		//		act.moveToElement(source).perform();
		//		act.clickAndHold().perform();
		//		act.moveToElement(target).perform();
		//		act.release().perform();

		//Approach: 2
		//Multiple actions in single line			
		act.clickAndHold(source).moveToElement(target).release().build().perform();				
	}
}
