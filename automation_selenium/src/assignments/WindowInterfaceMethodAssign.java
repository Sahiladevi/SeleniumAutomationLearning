package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

/*April 23 2024 - Day05
 * AssignmentQues: WATS to perform foll. actions: 
1: Open Firefox Browser 
2: Open Google app 
3: Open Facebook app 
4: Navigate back to google and verify whether google webpage is displayed or not 
5: Change browser size to 500 * 400 
6: Change position of browser to 250 * 400 
7: Maximize the browser 
8: Move forward to facebook and verify whether facebook webpage is displayed or not 
9: wait for 2 sec and refrsh the browser 
10: Close the browser  
 */
public class WindowInterfaceMethodAssign {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		driver.navigate().to("https://www.facebook.com/"); 
		Thread.sleep(2000); 
		driver.navigate().back(); 

		//Verify the title
		String titleName = driver.getTitle();
		if(titleName.equalsIgnoreCase("Google"))
		{
			System.out.println("Page is displayed");
		}
		else
		{
			System.out.println("Page is not displayed");
		}

		//Set the Size
		driver.manage().window().setSize(new Dimension(500,400));
		Thread.sleep(2000);
		//Set the position
		driver.manage().window().setPosition(new Point(250,400));
		Thread.sleep(2000);
		//Maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		//Verify the title
		String titleName1 = driver.getTitle();
		if(titleName1.contains("Facebook"))
		{
			System.out.println("Page is displayed");
		}
		else
		{
			System.out.println("Page is not displayed");
		}
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.close();
		




	}

}
