package data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SetCellValueMethod {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String excelFilePath = "../automation_selenium/testdata/FetchingExcelDataPractice.xlsx";
		//To copy the file from the specified path
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		//To open excel file
		Workbook book =WorkbookFactory.create(inputStream);
		//To identify the specifies sheet in the excel file
		Sheet sheet  = book.getSheet("Practice3_remove");
		
		//Overide the cell(0) value in row(1)		
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		cell.setCellValue("Java Selenium");		
		
		//Writing to the excel file
		FileOutputStream out = new FileOutputStream(excelFilePath);
		book.write(out);
		
	}

}
