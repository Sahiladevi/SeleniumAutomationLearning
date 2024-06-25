package handling_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectSingleSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		//Inspecting for day List box using selectByValue method
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);

		//Selecting Aug month---->Since Facebook DOB singleSelection ListBox
		monthSelect.selectByIndex(7);
		
		Thread.sleep(2000);
		//Deselect  Aug month
		monthSelect.deselectByIndex(7); 
		Thread.sleep(2000);
		driver.close();
	}

}
