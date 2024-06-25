package mock2;
/*
 * Question1: xpath expression for iphone 14 midnight 128gb ram --> Add to compare
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIphonePrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		// passing value into the Search text field
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone 14 midnight 128gb ram", Keys.ENTER);
		WebElement price = driver.findElement(By.xpath(
				"//div[text()='Apple iPhone 14 (Midnight, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		System.out.println("Iphone Price: "+price.getText());
		
		Thread.sleep(3000);
		driver.close();			
	}

}
