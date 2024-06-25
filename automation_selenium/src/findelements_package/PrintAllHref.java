package findelements_package;
/*
 * WATS to print every link href property value as an
 * output in google webpage * 
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllHref {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		List<WebElement> linkRef = driver.findElements(By.xpath("//a"));
		int linkCount =  linkRef.size();
		System.out.println("Total number of links: "+linkCount);		
		int index =1;
		
		//Using foreach loop to print every href propert value of web element		
		for (WebElement ele : linkRef) {

			String hrefValue = ele.getAttribute("href");
			System.out.println(index++ +". "+ hrefValue);	
		}		
		
		driver.close();
	}
}
		
		
		
		
				
//		int ind =1;
//		//Using for loop
//		System.out.println("--------------------------------Using for loop--------------------------------------------------------------");
//		
//		for (int i = 0; i < linkCount; i++) {
//			String hrefValue = linkRef.get(i).getAttribute("href");
//			System.out.println(ind++ +". "+ hrefValue);
//		}
//		
//		
//		
//	

