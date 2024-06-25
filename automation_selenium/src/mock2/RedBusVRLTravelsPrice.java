package mock2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBusVRLTravelsPrice {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		
		driver.findElement(By.id("src")).sendKeys("Bangalore",Keys.ENTER,Keys.TAB);
		driver.findElement(By.id("dest")).sendKeys("Hubli",Keys.ENTER);
		
		//driver.findElement(By.className("dayText")).;
		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//div[text()='30 May']"));
		

	}

}
