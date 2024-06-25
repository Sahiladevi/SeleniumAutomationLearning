package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * April 24 2024 - Day 06
 * Ques: WATS to open facebook application in any browser 
 */

public class OpenFacebookInAnyBrowser {
	WebDriver driver; 
	public void browser(String browsername) 
	{ 
		if(browsername.equals("Firefox")) 
		{ 
			driver = new FirefoxDriver(); 
		} 
		else if(browsername.equals("Chrome")) 
		{ 
			driver = new ChromeDriver(); 
		} 
		else 
		{ 
			driver  = new EdgeDriver(); 
		} 
		driver.get("https://www.facebook.com/"); 
		driver.close(); 
	} 
	public static void main(String[] args) 
	{ 
		OpenFacebookInAnyBrowser rv = new OpenFacebookInAnyBrowser(); 
		rv.browser("Firefox"); 
		rv.browser("Chrome"); 
		rv.browser("Edge");
	}

}
