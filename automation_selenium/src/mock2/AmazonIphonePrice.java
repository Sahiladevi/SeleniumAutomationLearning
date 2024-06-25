package mock2;
/*
 * Question 4: Open Amazon,Write xpath expression for iphone 14 midnight
 * (Search result not showing iphone 14 128gb midnight manually , so i used 512gb )
 */
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIphonePrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14 midnight 512gb ram",Keys.ENTER);

		WebElement price = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (512 GB) - Midnight']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']"));
		System.out.println("Iphone Price: "+price.getText());
		Thread.sleep(2000);
		driver.close();
	}

}
