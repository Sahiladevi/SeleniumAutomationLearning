package assignments;

import org.openqa.selenium.chrome.ChromeDriver;

/*April22 2024 - day04
 * AssignmentQues: Write a test script to perform foll. action 
1: OPen Chrome browser 
2: Open facebook 
3: Open new chrome window 
4: Open facebook 
5: Close both the window. 
 * 
 */
public class CloseWindowAssign {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		ChromeDriver driver2 = new ChromeDriver();
		driver2.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver2.close();
		
		Thread.sleep(2000);
		driver1.close();
	}

}
