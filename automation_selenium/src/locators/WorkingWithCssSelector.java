package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\login_css_selector.html");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Rima");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Rima@3456");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.cssSelector("input[type='button']")).click();		
		Thread.sleep(2000);
		driver.close();
	}
}
