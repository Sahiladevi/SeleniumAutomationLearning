package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellTypeMethod {
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
		//Cell password = row.getCell(1);
		//Identifying datatype of value in the excel sheet
		
		CellType emailDataType =email.getCellType();
		if (emailDataType == CellType.STRING) {
			String emailValue = email.getStringCellValue();
			System.out.println("Email: "+emailValue);
			
		} else {
			double emailValue = email.getNumericCellValue();
			System.out.println("Email: "+emailValue);
		}
		
	}

}
