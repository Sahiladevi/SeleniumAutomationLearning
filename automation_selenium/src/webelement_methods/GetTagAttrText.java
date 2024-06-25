package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagAttrText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement forgotPwd = driver.findElement(By.linkText("Forgot password?"));
		
		//WebElement forgotPwd = driver.findElement(By.xpath("//a[contains(@href,'=facebook_login')]"));
		
		String tagName = forgotPwd.getTagName();
		String attribute = forgotPwd.getAttribute("href");
		String text = forgotPwd.getText();
		
		System.out.println("tag name: "+ tagName);
		System.out.println("Attribute: "+attribute);
		System.out.println("Link: "+ text);
		
	}

}
