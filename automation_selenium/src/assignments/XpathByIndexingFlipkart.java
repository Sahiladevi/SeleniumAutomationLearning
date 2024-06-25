package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndexingFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");;

		//passing value into the Search text field
		driver.findElement(By.className("Pke_EE")).sendKeys("mobile");

		//Clicking on the search button
		driver.findElement(By.className("_2iLD__")).click();

		//1. Identifying the first checkbox element
		WebElement firstCheckbox = driver.findElement(By.xpath("(//div[@class='XqNaEv'])[1]"));
		firstCheckbox.click();		
		
		Thread.sleep(2000);

		//2. Identifying the last checkbox element
		WebElement lastCheckbox = driver.findElement(By.xpath("(//div[@class='XqNaEv'])[last()]"));
		lastCheckbox.click();		
				
		//3. Identifying the Second last checkbox element
		WebElement secondLastCheckbox = driver.findElement(By.xpath("(//div[@class='XqNaEv'])[last()-1]"));
		secondLastCheckbox.click();		

		//		Thread.sleep(2000);
		//		driver.close();
	}

}
