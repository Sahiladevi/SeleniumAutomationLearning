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

public class SampleWithNullValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String excelFilePath = "../automation_selenium/testdata/FetchingExcelDataPractice.xlsx";
		
			FileInputStream fis = new FileInputStream(excelFilePath);

			Workbook book =WorkbookFactory.create(fis);
			//To identify the specifies sheet in the excel file
			Sheet sheet  = book.getSheet("Practice1");			

			for (Row row : sheet) {
				for (Cell cell : row) {
					if (cell.getCellType() == CellType.BLANK) {
						System.out.println("Found a blank cell at row " + row.getRowNum() + ", column " + cell.getColumnIndex());
					}
				}
			}

		}
	}
