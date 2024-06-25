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

public class RemoveCellRowSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String filePath = "../automation_selenium/testdata/FetchingExcelDataPractice.xlsx";
		//To copy the file from the specified path
		FileInputStream inputStream = new FileInputStream(filePath);
		//To open excel file
		Workbook book =WorkbookFactory.create(inputStream);
		//To identify the specifies sheet in the excel file
		Sheet sheet  = book.getSheet("DeletingSheet");

		//To remove 3rd row 1st cell
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		row.removeCell(cell);

		//To remove 4th row
		Row removeRow = sheet.getRow(3);
		sheet.removeRow(removeRow);
		//removing the excel sheet
		book.removeSheetAt(4);
		//Writing to the excel file
		FileOutputStream out = new FileOutputStream(filePath);
		book.write(out);

	}

}
