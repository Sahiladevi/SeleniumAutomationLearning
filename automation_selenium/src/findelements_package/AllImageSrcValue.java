package findelements_package;
/*
 * WATS to print every image src property value as a
 * output in flipkart application 
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllImageSrcValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//img webelement
		List<WebElement> imgRef = driver.findElements(By.xpath("//img"));
		int imgCount =  imgRef.size();
		System.out.println("Total number of images: "+imgCount);
		int index =1;		

		//Using foreach loop to print every img src propertyvalue 		
		for (WebElement ele : imgRef) {
			String imgSrc = ele.getAttribute("src");
			System.out.println(index++ +". "+imgSrc);	
		}
		
		driver.close();
	}
}
