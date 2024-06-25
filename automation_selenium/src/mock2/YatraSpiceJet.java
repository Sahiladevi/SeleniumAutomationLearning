package mock2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YatraSpiceJet {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");

		//Clicking on Round trip
		driver.findElement(By.xpath("//a[@title='Round Trip']")).click();
		WebElement origin = driver.findElement(By.id("BE_flight_origin_city"));
		origin.click();

		//		origin.clear();
		Thread.sleep(2000);
		origin.sendKeys(Keys.CLEAR,"MAA",Keys.ENTER,Keys.TAB);


	}
}