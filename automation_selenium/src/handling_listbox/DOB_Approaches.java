package handling_listbox;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB_Approaches {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		// using Approach 1 : findelement() for month listbox
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[text()='Aug']")).click();
		
		// using Approach 2a : sendkeys or keystroke for day listbox
		WebElement day = driver.findElement(By.id("day"));
		day.sendKeys("13");
		
		//Approach 2b Keystroke --Robert Class
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		
		//Approach 3: Select class
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearSelect = new Select(year);
		yearSelect.selectByVisibleText("1984");
		Thread.sleep(2000);
		yearSelect.selectByValue("2000");
		Thread.sleep(2000);
		yearSelect.selectByIndex(10);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
