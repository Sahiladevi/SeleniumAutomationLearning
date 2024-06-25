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

public class CreateNewSheetRowCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String filePath = "../automation_selenium/testdata/FetchingExcelDataPractice.xlsx";
		//To copy the file from the specified path
		FileInputStream inputStream = new FileInputStream(filePath);
		//To open excel file
		Workbook book =WorkbookFactory.create(inputStream);
		//To create new sheet in the excel file
		Sheet newSheet = book.createSheet("Testing");
		//To create new row in the new sheet
		Row newRow = newSheet.createRow(0);
		//To create a new cell in the new row
		Cell newCell = newRow.createCell(1);
		newCell.setCellValue("Life");
		//Writing to the excel file
		FileOutputStream out = new FileOutputStream(filePath);
		book.write(out);
	}
}
