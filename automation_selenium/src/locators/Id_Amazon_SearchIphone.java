package locators;
/*
 * April 26 2024 - DAy 08
 * WATS to search for iphones mobiles in Amazon
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Amazon_SearchIphone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		WebElement searchTextField = driver.findElement( By.id("twotabsearchtextbox"));
		searchTextField.sendKeys("iphones");
		
		Thread.sleep(2000);
		
		By searchButtonLoc = By.id("nav-search-submit-button");
		WebElement searchButton = driver.findElement(searchButtonLoc);
		searchButton.click();
		
		Thread.sleep(2000);
		driver.close();						
	}	

}
