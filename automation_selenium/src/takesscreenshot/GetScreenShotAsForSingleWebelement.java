package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShotAsForSingleWebelement {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Take web page Screen shot
		TakesScreenshot screen = (TakesScreenshot)driver;
		//Identify the web element
		WebElement element = driver.findElement(By.name("login"));
		//web element storing path
		File src = element.getScreenshotAs(OutputType.FILE);
		//Where to store the file		
		File dest = new File("../automation_selenium/screenshot/FBlogin.png");
		//Save the image 
		FileUtils.copyFile(src, dest);
	}

}
