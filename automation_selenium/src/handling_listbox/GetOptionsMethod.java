package handling_listbox;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		//Inspecting for day List box using selectByVisibleText method
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect = new Select(year);
		
		List<WebElement> yearCount = yearSelect.getOptions();
		int count = yearCount.size();
		
		System.out.println("Total number of year in the list: "+count);
		
		Thread.sleep(2000);
		driver.close();
	}
}
