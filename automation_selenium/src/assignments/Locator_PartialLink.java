package assignments;
/*
 * WATS to click on gmail link on google web application using patialLinkText
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_PartialLink {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.partialLinkText("Gma")).click();
		Thread.sleep(2000);
		driver.close();						
	}			
}
