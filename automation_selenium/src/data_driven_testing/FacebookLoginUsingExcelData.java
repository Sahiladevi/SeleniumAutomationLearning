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

public class FacebookLoginUsingExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String excelFilePath = "../automation_selenium/testdata/FacebookDetails.xlsx";
		//To copy the file from the specified path
		FileInputStream inputFile = new FileInputStream(excelFilePath);
		//To open excel file
		Workbook book =WorkbookFactory.create(inputFile);
		//To identify the specifies sheet in the excel file
		Sheet sheet  = book.getSheet("LoginCredentials");
		//To fetch the cell data from excel
		Row row = sheet.getRow(1);
		String email = row.getCell(0).getStringCellValue();
		String password = row.getCell(1).getStringCellValue();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}
}
