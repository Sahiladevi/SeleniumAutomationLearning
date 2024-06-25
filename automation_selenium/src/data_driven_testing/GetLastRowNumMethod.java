package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetLastRowNumMethod {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String filePath = "../automation_selenium/testdata/FetchingExcelDataPractice.xlsx";
		//To copy the file from the specified path
		FileInputStream inputStream = new FileInputStream(filePath);
		//To open excel file
		Workbook book =WorkbookFactory.create(inputStream);
		//To identify the specifies sheet in the excel file
		Sheet sheet  = book.getSheet("Practice1");
		//To get the total number of rows used in the specified excel sheet
		int totalRow = sheet.getLastRowNum();
		System.out.println("Total Number of rows used in the specified excel sheet: "+totalRow);
	}

}
