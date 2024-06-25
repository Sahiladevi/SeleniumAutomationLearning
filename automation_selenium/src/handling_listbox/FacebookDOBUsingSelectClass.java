package handling_listbox;
/*
 * WATS to select DOB in Facebook web application using Select class 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOBUsingSelectClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		//Inspecting for month select WebElement using selectByIndex method
		WebElement month = driver.findElement(By.id("month"));
		Select monthSelect = new Select(month);
		monthSelect.selectByIndex(7);
		
		//Inspecting for day List box using selectByValue method
		WebElement day = driver.findElement(By.id("day"));
		Select daySelect = new Select(day);
		daySelect.selectByValue("13");
		
		//Inspecting for day List box using selectByVisibleText method
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect = new Select(year);
		yearSelect.selectByVisibleText("1984");
		
		Thread.sleep(3000);
		driver.close();
	}

}
