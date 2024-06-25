package assignments;

import org.openqa.selenium.By;
/*
 * Program to click on forgot passwork link on facebook web application
 * 						Using
 * Xpath by contains() text
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsText_ForgotPwd {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//clicking on forgot password link
		driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();

		driver.close();
	}
}
