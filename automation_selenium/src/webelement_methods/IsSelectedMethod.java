package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
		female.click();
		boolean b1 = female.isSelected();
		
		if (b1) {
			System.out.println("female radio button is selected");
			
		} else {
			System.out.println("female radio button is not selected");

		}
		WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
		male.click();
		boolean b2 = male.isSelected();
		boolean bf = female.isSelected();
		if (bf) {
			System.out.println("female radio button is selected");
			
		} else {
			System.out.println("female radio button is not selected");

		}
		
	}

}
