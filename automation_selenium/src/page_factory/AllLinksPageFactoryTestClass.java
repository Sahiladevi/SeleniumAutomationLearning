package page_factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksPageFactoryTestClass {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AllLinksPageFactoryClass link = new AllLinksPageFactoryClass(driver);		
		System.out.println("Total number of links: "+link.linkCount());
		link.allLinksText();	
		driver.close();
	}

}
