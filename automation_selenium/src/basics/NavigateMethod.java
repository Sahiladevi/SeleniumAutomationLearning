package basics;
/*April 23 2024 - Day 05 
 * --> It is used to perform foll. actions: 
1: Open app using to() 
Note: to() is used to open app. or It is an alternate method to open application
2: Browser backward action using back() method. 
3: Browser forward action using forward() method. 
4: Refresh browser using "refresh()" method.  
 */

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {		 
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/"); 
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/"); 
		driver.navigate().back(); 
		driver.navigate().forward(); 
		driver.navigate().refresh(); 
		driver.close(); 
	}

}
