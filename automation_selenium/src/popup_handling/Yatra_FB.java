package popup_handling;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra_FB {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a [@class='dropdown-toggle']")).click();
		driver.findElement(By.id("SignUpBtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button [@class='fb-btn']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _4jy3 _4jy2 selected _51sy')]")).click();
//		java.util.Set<String> s = driver.getWindowHandles();
//		Iterator<String> itr = s.iterator();
//		while(itr.hasNext())
//		{
//			String refid = itr.next();
//			driver.switchTo().window(refid);
//			String title = driver.getTitle();
//			System.out.println(title);
//		}
	}

}
