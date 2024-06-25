package findelements_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> linkRef = driver.findElements(By.xpath("//a"));
		int linkCount =  linkRef.size();
		
//		for (WebElement ele : linkRef) {
//			
//			String linkText = ele.getText();
//			System.out.println(linkText);
//			
//		}
		int index=1;
		for (int i = 0; i < linkCount; i++) {
			
			String linkText = linkRef.get(i).getText();
			System.out.println(index++ +" : "+linkText);
			
		}
		driver.close();
		
	}

}
