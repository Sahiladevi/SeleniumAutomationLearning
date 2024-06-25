package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

/*April22 2024 Day04
 * Ques: Write a test script to perform foll. actions: 
1: Open firefox Browser 
2: Open facebook app 
3: Open google app. in same window 
4: Close browser 
 */
public class OpenBothAppInSameWindow {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.close();
	}

}
