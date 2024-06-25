package assignments;
/*
 * WAT to display both rating and reviews for REDMI 9 Activ (Coral Green, 128 GB) 
 *  (6 GB RAM)in flipkart web page 
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependantDependantXpathFlipkart {	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		//passing value into the Search text field
		driver.findElement(By.className("Pke_EE")).sendKeys("REDMI 9 Activ (Coral Green, 128 GB)  (6 GB RAM)");

		//Clicking on the search button
		driver.findElement(By.className("_2iLD__")).click();
		
		//identifying  dynamic element rating and reviews
		WebElement element = driver.findElement(By.xpath("(//div[@class='KzDlHZ']/..//span[@class='Wphh3N'])[1]"));
		String elementValue = element.getText();
		System.out.println("Rating and Review Values: "+elementValue);

//		//identifying  dynamic element rating
//
//		WebElement ratingElement = driver.findElement(By.xpath("(//div[@class='KzDlHZ']/..//span[contains(text(),'Ratings')])[1]"));
//
//		String ratingValue = ratingElement.getText();
//
//		//identifying dynamic element reviews
//		WebElement reviewElement = driver.findElement(By.xpath("(//div[@class='KzDlHZ']/..//span[contains(text(),'Reviews')])[1]"));
//
//		//getting the text of web element
//		String reviewValue = reviewElement.getText();
//		
//		//Concatenating the rating and review Value
//		System.out.println("Rating and Review Values: "+ratingValue+"&"+reviewValue);
		
		Thread.sleep(3000);
		driver.close();
	}
}
