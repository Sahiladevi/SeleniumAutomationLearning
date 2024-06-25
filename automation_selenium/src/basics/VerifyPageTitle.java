package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * April 22 2024 - Day 04
 * Ques: WATS to verify Google webpage is displayed or not --> To do verification by using string class, we can use following methods: 
1: equals(): this method is used to verify string but case sensitive and accepts complete string. 
2: contains(): Case Sensitive but accepts only few characters in sequence. 
3: equalsignorecase(): Not case sensitive but it accepts complete string.
 * 
 */
public class VerifyPageTitle {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.google.com/"); 
		String str = driver.getTitle(); 
		if(str.equals("Google")) 
		{ 
			System.out.println("Page Displayed"); 
		} 
		else 
		{ 
			System.out.println("Page not displayed"); 
		} 
		driver.close(); 

	}

}
