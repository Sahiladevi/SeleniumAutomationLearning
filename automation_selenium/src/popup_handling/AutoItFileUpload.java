package popup_handling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItFileUpload {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online2pdf.com/");	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Select files']")).click();
		//Runtime.getRuntime().exec("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\AutoIT_Workspace\\upload_example.exe");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\AutoIT_Workspace\\Exampledoc.exe");
		Thread.sleep(5000);
		driver.close();
	}

}
