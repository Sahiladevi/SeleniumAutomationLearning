package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountUsingKeyStroke {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//Identifying the username text field element 
		WebElement userName =driver.findElement(By.id("email"));
		
		//driver.findElement(By.xpath("//input[@id='email']/../../..//a[text()='Create new account']")).click();
		
		//Moving to Create new account tab using tab keys
		userName.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);	
				
		//Identifying the firstname text field element in signup window
		Thread.sleep(2000);		
		WebElement firstName =driver.findElement(By.name("firstname"));			

		//Entering the Value into the userName	
		String fname = "ChandraBose";
		firstName.sendKeys(fname);
		
		//Approach:1 select the text and press backspace
		firstName.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		firstName.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(2000);		

		//Approach:2 using for loop to delete each character one by one.
		firstName.sendKeys(fname);		
		//Clearing the test with backspace
		for (int i = 0; i < fname.length(); i++) 
		{
			Thread.sleep(1000);
			firstName.sendKeys(Keys.BACK_SPACE);			
		}

		Thread.sleep(2000);
		driver.close();
	}
}
