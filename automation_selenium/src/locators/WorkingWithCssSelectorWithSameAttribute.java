package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelectorWithSameAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\login_duplicateattribute_css.html");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Rima");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Rima@3456");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("klm"); 
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("pqr"); 
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='button']")).click();		
		Thread.sleep(2000);
		driver.close();
	}

}
