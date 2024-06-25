package mock2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusVRTravel {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/travels/vrl-travels");

		WebElement travelPrice = driver.findElement(
				By.xpath("//a[text()='Pune to Bangalore']/parent::div[@class='route_details']//span[@class='fare']"));
		
		System.out.println("Travel price from pune to bangalore: "+travelPrice.getText());
//		Thread.sleep(2000);
//		driver.close();

	}

}
