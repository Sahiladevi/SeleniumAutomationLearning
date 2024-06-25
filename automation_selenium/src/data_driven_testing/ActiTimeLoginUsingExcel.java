package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginUsingExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String excelFilePath = "../automation_selenium/testdata/actiTimeProject.xlsx";
		//To copy the file from the specified path
		FileInputStream inputFile = new FileInputStream(excelFilePath);
		//To open excel file
		Workbook book =WorkbookFactory.create(inputFile);
		//To identify the specifies sheet in the excel file
		Sheet sheet  = book.getSheet("actiLoginCredentials");
		//To fetch the cell data from excel
		Row row = sheet.getRow(1);
		String username = row.getCell(0).getStringCellValue();
		String password = row.getCell(1).getStringCellValue();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://sahiladevi/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
		
	}

}
