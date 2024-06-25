package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OddCheckbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");;

		//passing value into the Search text field
		driver.findElement(By.className("Pke_EE")).sendKeys("mobile");

		//Clicking on the search button
		driver.findElement(By.className("_2iLD__")).click();
		
		Thread.sleep(3000);	
		//Identifying the odd element
		List<WebElement> oddCheckbox = driver.findElements(By.xpath("(//div[@class='XqNaEv'])[position()mod(2)=0]"));
		for(int i=0;i<oddCheckbox.size();i++)
		{
			oddCheckbox.get(i).click();
			Thread.sleep(3000);			
		}
		
	}

}
