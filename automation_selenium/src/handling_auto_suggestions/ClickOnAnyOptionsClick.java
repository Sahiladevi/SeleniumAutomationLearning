package handling_auto_suggestions;
/* 
 * WATS to click on any one of the auto suggestion option in google web page
 *  */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAnyOptionsClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> autoOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));

		String expSearchText = " python";

		int optionsSize = autoOptions.size();
		System.out.println("Total number of auto options: "+optionsSize);

		for (WebElement options : autoOptions) {
			String optionsText = options.getText();
			if(optionsText.contains(expSearchText)) {
				try {
					options.click();
				} catch (Exception e) {
				System.out.println(e.getMessage());
				}
				
			}								
		}		
	}

}
