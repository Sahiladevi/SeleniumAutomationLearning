package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * April 22 2024 -Day04
 * Ques: Write a test script to perform foll. actions: 
1: Open Firefox Browser 
2: OPen Facebook App. 
3: OPen New window 
4: Open Google application in new window 
5: Close the window
 */
public class CloseWindowAction {
	
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/"); 
		FirefoxDriver driver1 = new FirefoxDriver(); 
		driver1.get("https://www.google.com/");
		driver1.close();
		driver.close();
	}

}
