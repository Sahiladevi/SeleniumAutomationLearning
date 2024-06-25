package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastCellNumMethod {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String filePath = "../automation_selenium/testdata/FetchingExcelDataPractice.xlsx";
		//To copy the file from the specified path
		FileInputStream inputStream = new FileInputStream(filePath);
		//To open excel file
		Workbook book =WorkbookFactory.create(inputStream);
		//To identify the specifies sheet in the excel file
		Sheet sheet  = book.getSheet("Practice1");
		//To get the specified row
		Row row = sheet.getRow(1);
		short totalCell = row.getLastCellNum();
		System.out.println("Total Number of cells used in the specified row: "+totalCell);
	}

}
