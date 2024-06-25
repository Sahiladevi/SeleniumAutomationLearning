package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintDataInMatrixFormat {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String filePath = "../automation_selenium/testdata/FetchingExcelDataPractice.xlsx";
		//To copy the file from the specified path
		FileInputStream inputStream = new FileInputStream(filePath);
		//To open excel file
		Workbook book =WorkbookFactory.create(inputStream);
		//To identify the specifies sheet in the excel file
		Sheet sheet  = book.getSheet("Matrix");
		//Identify total number of rows used in Matrix Sheet
		int rowNumber = sheet.getLastRowNum();
		for (int i = 0; i <= rowNumber; i++) {
			Row row = sheet.getRow(i);
			for (int cellNum = 0; cellNum <=1; cellNum++) {
				Cell cell = row.getCell(cellNum);
				//Approach1:
				//String cellValue = cell.getStringCellValue();
				//Approach2:
				String cellValue = cell.toString();
				System.out.print(cellValue+" ");
			}
			System.out.println("");
		}
	}

}
