package customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YatraMoveToElementAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");

		//mouse over to the element 
		WebElement mouseOverElement = driver.findElement(By.xpath("//span[@class='more-arr']"));
		//Creating Action class object to perform mouse action
		Actions act = new Actions(driver);
		act.moveToElement(mouseOverElement).perform();	
		Thread.sleep(2000);

		//Clicking on Adventures web element by mouse over action		
		WebElement dropdownElement = driver.findElement(By.xpath("//span[text()='Adventures']"));
		act.moveToElement(dropdownElement).click().perform();

		//To get the landed web page title
		System.out.println("Landed on Webpage title: "+driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
}
