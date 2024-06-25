package mock2;
/**
 * Identifying travelling prices for vrl travels at any time.
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VrlTravels {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get(
				"https://www.redbus.in/bus-tickets/bangalore-to-hubli?fromCityName=Bangalore&fromCityId=122&srcCountry=IND&toCityName=Hubli&toCityId=222&destCountry=IND&onward=25-May-2024&opId=0&busType=Any");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='close-primo']")).click();
		WebElement travelsName = driver.findElement(By.id("opfilter"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", travelsName);
		travelsName.click();
		
		driver.findElement(By.name("inpFilter")).sendKeys("vrl");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@for='op_25338'])[1]")).click();
		driver.findElement(By.xpath("//div[text()='APPLY']")).click();
		
		
		//VRL Travels - price		
		List<WebElement> vrlBusListPrices= driver.findElements(By.xpath("//div[text()='VRL Travels']/ancestor::div[@class='clearfix row-one']/../descendant::div[@class='fare d-block']"));
		System.out.println("List size: "+vrlBusListPrices.size());
		int index = 1;
		for (WebElement price : vrlBusListPrices) {
			String busPrice = price.getText();			
			System.out.println(index++ +". "+busPrice);
		}			
	}

}
