package assignments;
/*
 * WATS to display firstname field entered text as an output * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstNameEnteredText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//Clicking on create account
		driver.findElement(By.xpath("//a[contains(text(), 'new account')]")).click();
		
		Thread.sleep(2000);
		//entering text in first name text field
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Sita");
		
		//getting the entered value in the the text field of first name
		String fnEnteredValue = firstName.getAttribute("value");		
		System.out.println("First name field entered text value: "+fnEnteredValue);
		Thread.sleep(2000);
		driver.close();
	}
}
