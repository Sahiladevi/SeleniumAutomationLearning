package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Index_AbsolutePath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\xpath_index._absolute.html");
		
		WebElement element =driver.findElement(By.xpath("/html/body/div/a[1] "));
		System.out.println(element.getText());
		
		WebElement element1 =driver.findElement(By.xpath("//div/input[2]"));
		element1.sendKeys("Meenu");
		
	}
	

}
