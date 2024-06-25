package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Ques: WATS to handle component by using Absolute xpath for below webpage 
<html> 
<body> 
FirstName<input type="text"><br> 
LastName<input type="text"><br> 
PWD<input type="password"><br> 
C_PWD<input type="password"><br> 
</body> 
</html>
 * 
 */

public class AbsoluteXpathHTML {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\absolutepath.html"); 
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("abd"); 
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("klp"); 
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("sdfh"); 
		driver.findElement(By.xpath("/html/body/input[4]")).sendKeys("se");
		
		driver.close();
	}

}
