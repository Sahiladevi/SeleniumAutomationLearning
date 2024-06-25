package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {		
		
		//To copy the file from the specified path
		FileInputStream inputStream = new FileInputStream("../automation_selenium/testdata/externalProperty.properties");
		
		//To open the property file
		Properties prop = new Properties();
		prop.load(inputStream);
		
		//To fetch the data from property file
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);		
	}
}
