package dropdown_actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		int drag_x = source.getLocation().getX();
		int drag_y = source.getLocation().getY();
//		act.moveToElement(source).perform();
//		act.clickAndHold().perform();
//		act.moveByOffset(drag_x, drag_y).release().perform();
		
		act.moveToElement(source).clickAndHold().moveByOffset(drag_x, drag_y).release().build().perform();
	}

}
