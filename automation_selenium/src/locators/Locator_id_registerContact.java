package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator_id_registerContact {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\registerName.html"); 
		//firstname 
		By fn = By.id("name"); 
		WebElement ele = driver.findElement(fn); 
		ele.sendKeys("abc"); 
		//lastname 
		By ln = By.className("last"); 
		WebElement ele1 = driver.findElement(ln); 
		ele1.sendKeys("mno"); 
		//email 
		By mail = By.name("mailid"); 
		WebElement ele2 = driver.findElement(mail); 
		ele2.sendKeys("admn"); 
		//pwd 
		By pwd = By.id("pwd"); 
		WebElement ele3 = driver.findElement(pwd); 
		ele3.sendKeys("klm"); 
		//c_pwd 
		By c_pwd = By.name("password"); 
		WebElement ele4 = driver.findElement(c_pwd); 
		ele4.sendKeys("klm"); 
		//contact 
		By cont = By.id("mobile"); 
		WebElement ele5 = driver.findElement(cont); 
		ele5.sendKeys("335234");
	}

}
