package popup_handling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		//Thread.sleep(2000);
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Got it']")).click();
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
		
		System.out.println("============Getting the count of Windows=======================");
		Thread.sleep(2000);
		Set<String> windowsReference = driver.getWindowHandles();
		
		int windowsCount = windowsReference.size();
		System.out.println("Total number of windows: "+windowsCount);
		
		System.out.println("=============Getting title of  all the window==================");
		int index = 1;
		Iterator<String> itr =  windowsReference.iterator();
		while(itr.hasNext())
		{
			String referenceId = itr.next();
			driver.switchTo().window(referenceId);			
			String windowTitle = driver.getTitle();
			System.out.println(index++ + ". "+windowTitle);
		}
		
		//To close both parent and child browser window
		Thread.sleep(2000);
		driver.quit();
		}
}
