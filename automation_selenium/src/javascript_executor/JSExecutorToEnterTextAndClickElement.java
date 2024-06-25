package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorToEnterTextAndClickElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Explicit type casting to access the method present in JSExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//To enter text using JSExecutor
		js.executeScript("document.getElementById('email').value='admin@gmail.com'");
		js.executeScript("document.getElementById('pass').value='manager123'");
		
		//To click using JSExecutor
		WebElement ele = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();",ele);

	}

}
