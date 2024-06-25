package popup_handling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdfConvertorUpload {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freepdfconvert.com/");	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Choose file')]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\AutoIT_Workspace\\Listbox.exe");				
		Thread.sleep(3000);
		driver.close();
	}
}
