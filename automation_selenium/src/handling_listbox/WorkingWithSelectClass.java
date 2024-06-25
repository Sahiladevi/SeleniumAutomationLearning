package handling_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://fatcowhosting.com/");
		WebElement countryList = driver.findElement(By.id("countrySelect"));
		
		Select countrySelect = new Select(countryList);
		countrySelect.selectByVisibleText("Canada");
		
		Thread.sleep(3000);
		driver.close();
	}

}
