package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorWithOutDocument {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sahiladevi/login.do");

		//Inspecting email and password
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		//Explicit type casting to access the method present in JSExecutor
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//To enter text using JSExecutor
		//js.executeScript("document.getElementsByName('username').value='admin';");
		js.executeScript("arguments[0].value='admin';",username);
		js.executeScript("arguments[0].value='manager';",password);
		Thread.sleep(2000);
		js.executeScript("document.getElementById('loginButton').click();");
		Thread.sleep(3000);
		//To scroll within the web page to certain location
		js.executeScript("window.scrollTo(0,40);");
		Thread.sleep(3000);
		//To scroll to bottom of the page
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//To scroll to top of the page
		js.executeScript("window.scrollTo(0,document.body.scrollTop);");

	}

}
