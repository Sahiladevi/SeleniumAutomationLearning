package handling_listbox;
/*
 * 
 * facebook app --> single selection list box -------> deselect method doesn't support
 * 
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectSingleItemFromMultipleSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		//Inspecting for day List box using selectByValue method
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);
		List<WebElement> months = monthSelect.getOptions();
		
		for (int i = 0; i<months.size() ; i=i+2) {
			monthSelect.selectByIndex(i);
		}
	}
		

}
