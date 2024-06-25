package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		Point userNameLocation = userName.getLocation();
		int x_cordinate = userNameLocation.getX();
		System.out.println("X-co-ordinate of username web element: "+x_cordinate);
		int y_cordinate = userNameLocation.getY();
		System.out.println("Y-co-ordinate of username web element: "+y_cordinate);
		
		driver.close();
	}

}
