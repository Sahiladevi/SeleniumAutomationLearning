package locators;
/*
 * April 26 2024
 * Ques: WATS to enter firstname,lastname,email & pwd in below webpage 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_Id_register {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\register.html"); 
		//firstname 
		By fn = By.id("name"); 
		WebElement ele = driver.findElement(fn); 
		ele.sendKeys("admin"); 
		//lastname 
		By ln = By.className("last"); 
		WebElement ele1 = driver.findElement(ln); 
		ele1.sendKeys("manager"); 
		//email 
		By email = By.id("email"); 
		WebElement ele2 = driver.findElement(email); 
		ele2.sendKeys("admin@gmail.com"); 
		//pwd 
		By pass = By.id("pwd"); 
		WebElement ele3 = driver.findElement(pass); 
		ele3.sendKeys("abc"); 
	}

}
