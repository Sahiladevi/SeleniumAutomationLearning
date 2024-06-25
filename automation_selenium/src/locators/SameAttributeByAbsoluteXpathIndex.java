package locators;
/*
 * <body> 
UN<input type="text"><br> 
PWD<input type="text"><br> 
Contact  <input type="text"><br> 
Email  <input type="text"><br> 
<input type="button" value="login"> 
</body>
 * 
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SameAttributeByAbsoluteXpathIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\login_duplicateattribute_css.html");
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Rima");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Rima@3456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("7896789500"); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/input[4]")).sendKeys("Rima@gmail.com"); 
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[type='button']")).click();		
		Thread.sleep(2000);
		driver.close();
	}

}
