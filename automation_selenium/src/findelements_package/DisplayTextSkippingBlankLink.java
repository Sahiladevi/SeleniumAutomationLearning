package findelements_package;
/*
 *WATS to display total number of links text as an output 
 *in google webpage 
 */
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayTextSkippingBlankLink {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		List<WebElement> linkRef = driver.findElements(By.xpath("//a"));
		int linkCount =  linkRef.size();
		System.out.println("Total link count: "+linkCount);
		//Counting links with text 
		int linkTextCount = 0;
		int index =1;
		for (WebElement ele : linkRef) {
			String linkText = ele.getText();
			if(!linkText.isBlank())
			{
				linkTextCount++;
				System.out.println(index++ +" : "+linkText);
			}			
		}
		System.out.println("Total number of Links with text: "+linkTextCount);
		driver.close();
	}
}
