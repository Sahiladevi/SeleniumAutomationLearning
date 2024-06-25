package basics;
/*
 * April 22 2024 - Day04
 * Ques: Write a test script to display title of a webpage 
 */
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleAndURL {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//title
		String titleName = driver.getTitle();
		System.out.println("Title of the current page: "+titleName);
		
		//URL
		String urlName = driver.getCurrentUrl();
		System.out.println("Title of the current Url: "+urlName);
		
		Thread.sleep(2000);
		driver.close();
	}

}
