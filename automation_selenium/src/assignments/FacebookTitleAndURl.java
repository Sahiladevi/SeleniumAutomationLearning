package assignments;
/*April 22 2024 - Day04
 * ------------------------------------------------------------------------- 
Ques: Write a test script to display title & url of facebook app. as o/p 
 */
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTitleAndURl {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
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
