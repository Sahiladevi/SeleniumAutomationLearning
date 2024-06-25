package locators;
/*
 * April26 2024- Day08
 * WATS to search for mobiles in flipkart app by using className()
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Flipkart_Search {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchTextField = driver.findElement( By.className("Pke_EE"));
		searchTextField.sendKeys("iphones");
		
		By searchButtonLoc = By.className("_2iLD__");
		WebElement searchButton = driver.findElement(searchButtonLoc);
		searchButton.click();
		
		Thread.sleep(2000);
		driver.close();	
		
	}
}
