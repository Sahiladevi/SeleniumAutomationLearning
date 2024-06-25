package assignments;
/*
 * WAP to click on add to compare element in flipkart web page
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndepAndDepAddToCompare {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		//passing value into the Search text field
		driver.findElement(By.className("Pke_EE")).sendKeys("REDMI 9 Activ (Coral Green, 128 GB)  (6 GB RAM)");

		//Clicking on the search button
		driver.findElement(By.className("_2iLD__")).click();

		//identifying  dynamic element add to compare
		
		driver.findElement(By.xpath("(//div[@class='KzDlHZ']/../../..//div[@class='XqNaEv'])[1]")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
