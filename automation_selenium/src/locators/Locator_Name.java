package locators;
import org.openqa.selenium.By;
/*
 * April 26 2024 - Day 8
 * WATS to enter selenium text in google search field by using name locator
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Name {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(5000);
		driver.close();
	}
	

}
