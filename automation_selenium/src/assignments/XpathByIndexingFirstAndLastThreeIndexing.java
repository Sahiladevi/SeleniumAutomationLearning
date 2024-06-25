package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexingFirstAndLastThreeIndexing {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");;

		//passing value into the Search text field
		driver.findElement(By.className("Pke_EE")).sendKeys("mobile");

		//Clicking on the search button
		driver.findElement(By.className("_2iLD__")).click();
		//Identifying the first 3 position of element
		List<WebElement> firstThreeCheckbox = driver.findElements(By.xpath("(//div[@class='XqNaEv'])[position()<=3]"));
		for(int i=0;i<firstThreeCheckbox.size();i++)
		{
			firstThreeCheckbox.get(i).click();
			Thread.sleep(3000);			
		}
		
		Thread.sleep(3000);	
		
		//Identifying the last 3 position of element
		List<WebElement> lastThreeCheckbox = driver.findElements(By.xpath("(//div[@class='XqNaEv'])[position()>=last()-2]"));
		for(int i=0;i<lastThreeCheckbox.size();i++)
		{
			lastThreeCheckbox.get(i).click();
			Thread.sleep(3000);			
		}
	}

}
