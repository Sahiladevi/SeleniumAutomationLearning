package handling_auto_suggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionOptionClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> autoOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		// Click on the first suggestion (you can choose any based on your requirement)
		if (autoOptions.size() > 0) {
			autoOptions.get(5).click();
		} else {
			System.out.println("No suggestions found.");
		}
		Thread.sleep(2000);
		driver.close();	
	}	
}
