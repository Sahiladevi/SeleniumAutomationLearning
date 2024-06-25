package basics;
/*April 23 2024 - Day 05
 * Ques: WATS to perform foll. actions: 
1: Open Firefox Browser 
2: Open Facebook app 
3: Open Google app 
4: Navigate to facebook app 
5: Navigate to google app 
6: Close the browser 
 * 
 */

import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleGetMethod {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.facebook.com/"); 
		driver.get("https://www.google.com/"); 
		driver.get("https://www.facebook.com/"); 
		driver.get("https://www.google.com/"); 
		driver.close(); 
	}
}
