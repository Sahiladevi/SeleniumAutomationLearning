package mock2;
/*
 * Identifying travelling price for VRL travels at any time
 * 
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusVRLTravels {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/travels/vrl-travels");

		List<WebElement> allListPrices = driver.findElements(By.xpath(
				"//a[@class='route']/ancestor::div[@class='route_link']/descendant::span[@class='fare']"));
		int totalNoOfListPrice = allListPrices.size();
		System.out.println("Number of Price List: "+totalNoOfListPrice);
		
		List<WebElement> routeNames = driver.findElements(By.xpath("//a[@class='route']"));

		int index = 1;
		System.out.println("Travelling price for VRL travels at any time");
		for (WebElement route : routeNames) {
			String routeName = route.getText();
			String routePrice = driver.findElement(By.xpath(
						"//a[text()='"+routeName+"']/ancestor::div[@class='route_link']/descendant::span[@class='fare']")).getText();
			System.out.println(index++ +". " + routeName+": " +routePrice);			
		}
		
		Thread.sleep(2000);
		driver.close();
		}
	}


