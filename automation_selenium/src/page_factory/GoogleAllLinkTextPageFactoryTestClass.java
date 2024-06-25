package page_factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAllLinkTextPageFactoryTestClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		GoogleAllLinkTextPageFactoryClass link = new GoogleAllLinkTextPageFactoryClass(driver);
		System.out.println("Total number of links in the current webpage: "+link.linkCount());
		link.allLinksText();	
		driver.close();
	}
}
