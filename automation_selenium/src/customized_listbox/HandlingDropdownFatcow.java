package customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HandlingDropdownFatcow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://fatcowhosting.com/");
		
		//mouse over to the element 
		
		WebElement mouseOverElement = driver.findElement(By.xpath("//a[text()='Around the Farm']"));
		
		//mouseOverElement.click();  --> it should throw error
		
		//Creating Action class object to perform mouse action
		Actions act = new Actions(driver);
		act.moveToElement(mouseOverElement).perform();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='subnav']//a[text()='Blog']")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
