package assignments;
/*
 * Question 3: Xpath expression to get iphone 14 midnight 128gb ram rating and reviews
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneRatingAndReviews {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		// passing value into the Search text field
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone 14 midnight 128gb ram", Keys.ENTER);
		
		WebElement ratingAndReviews = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']/parent::div[@class='col col-7-12']/descendant::span[@class='Wphh3N']"));
		System.out.println("Iphone 14 128GB rating and review: "+ratingAndReviews.getText());
		
		Thread.sleep(2000);
		driver.close();
	}
}
