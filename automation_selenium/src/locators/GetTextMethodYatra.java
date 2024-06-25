package locators;
/*
 * WATS to display test as an output in yatra.com
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethodYatra {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		
		WebElement element = driver.findElement(By.className("main-heading"));
		//System.out.println(ele.getText());
		String elementText = element.getText();
		System.out.println(elementText);
		
		Thread.sleep(2000);
		driver.close();	
	}
	

}
