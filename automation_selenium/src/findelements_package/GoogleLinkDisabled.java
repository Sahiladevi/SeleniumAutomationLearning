package findelements_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinkDisabled {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> linkRef = driver.findElements(By.xpath("//a"));
		int linkCount =  linkRef.size();
		
		System.out.println("Size of the List: "+linkCount);
		
		//counting the enabled link and disabled link separately
		int enabled =0;
		int disabled =0;
		
		
	}

}
