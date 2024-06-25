package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//To copy the file from the specified path
		FileInputStream inputStream = new FileInputStream("../automation_selenium/testdata/FacebookDetails.xlsx");
		//To open excel file
		Workbook book =WorkbookFactory.create(inputStream);
		//To identify the specifies sheet in the excel file
		Sheet sheet  = book.getSheet("LoginCredentials");
		//To get the specified row from excel sheet
		Row row = sheet.getRow(1);
		//Identify the cell from where we have to fetch the data
		Cell email = row.getCell(0);
		Cell password = row.getCell(1);
		String emailValue = email.getStringCellValue();
		String passwordValue = password.getStringCellValue();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys(emailValue);
		driver.findElement(By.id("pass")).sendKeys(passwordValue);
	}
}
