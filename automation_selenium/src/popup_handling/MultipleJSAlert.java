package popup_handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleJSAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		//Click on Simple JS Alert button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	
		//Switching selenium driver from main page to Alert window 
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		//To Peform confirmation Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.dismiss();
		
		Thread.sleep(2000);
		//To Peform Prompt Alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(5000);
		alert2.sendKeys("selenium");
		alert2.accept();
	}

}
