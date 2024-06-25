package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAndPasswordGetSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//getting username webelement Dimensions 
		WebElement userName = driver.findElement(By.id("email"));
		Dimension userDimension = userName.getSize();		
		System.out.println("User Dimension: "+userDimension);
		int userHeight = userDimension.getHeight();
		int userWidth = userDimension.getWidth();

		//getting password webelement Dimensions
		WebElement password = driver.findElement(By.id("pass"));
		Dimension passwordDimension = password.getSize();		
		System.out.println("Password Dimension: "+passwordDimension);
		int passwordHeight = passwordDimension.getHeight();
		int passwordWidth = passwordDimension.getWidth();
			
		
//		boolean result = userDimension.equals(passwordDimension);
//		System.out.println("comparison result: "+result);
		
		//verifying username Dimension and password Dimension are same or not
		if (userHeight == passwordHeight &&
				userWidth == passwordWidth ) {
			System.out.println("User Dimension and Password Dimesnsion are same ");			
			
		} else {
			System.out.println("User Dimension and Password Dimesnsion are not same ");
		}
		
		driver.close();
	}
}
