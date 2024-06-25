package assignments;
/*
 * Question 2: xpath expression for iphone 14 midnight 128gb ram --> Add to compare
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddToCompare {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	// passing value into the Search text field
	driver.findElement(By.className("Pke_EE")).sendKeys("iphone 14 midnight 128gb ram", Keys.ENTER);
	WebElement addToCompare =driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']/ancestor::a[@class='CGtC98']/descendant::div[@class='XqNaEv']"));
	addToCompare.click();
	Thread.sleep(3000);
	driver.close();
}
}
