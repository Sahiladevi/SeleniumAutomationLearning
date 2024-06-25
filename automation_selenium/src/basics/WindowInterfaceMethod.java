package basics;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

/*April 23 2024 Day05
 * Ques: WATS to perform foll. actions: 
1: Open Firefox Browser 
2: Open google app 
3: Open Facebook app 
4: Navigate back to google 
5: Navigate to facebook 
6: Refresh the browser 
7: Change broswer size to 300 * 500 
8: Change browser position to 160 * 290 
9: Maximize the browser 
10: Set browser fullscreen 
11: Minimize the browser 
12: Close the browser  
 */
public class WindowInterfaceMethod {
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		driver.navigate().to("https://www.facebook.com/"); 
		Thread.sleep(3000); 
		driver.navigate().back(); 
		Thread.sleep(3000); 
		driver.navigate().forward(); 
		Thread.sleep(3000); 
		driver.navigate().refresh(); 
		Thread.sleep(3000); 
		Dimension d = new Dimension(300,500); 
		driver.manage().window().setSize(d); 
		Thread.sleep(3000); 
		Point p = new Point(160,290); 
		driver.manage().window().setPosition(p); 
		Thread.sleep(3000); 
		driver.manage().window().maximize(); 
		Thread.sleep(3000); 
		driver.manage().window().fullscreen(); 
		Thread.sleep(3000); 
		driver.manage().window().minimize(); 
		Thread.sleep(3000); 
		driver.close(); 
		
	}

}
