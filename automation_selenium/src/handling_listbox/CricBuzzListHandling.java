package handling_listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricBuzzListHandling {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");


		driver.findElement(By.xpath("//div[text()='T20']/../../descendant::div[contains(text(),'Today')]")).click();
		// Clicking on Score Board
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		System.out.println("------------------Match information--------------");
		List<WebElement> details = driver.findElements(By.xpath("//div[@class='cb-col cb-col-27']"));
		
	}

}
