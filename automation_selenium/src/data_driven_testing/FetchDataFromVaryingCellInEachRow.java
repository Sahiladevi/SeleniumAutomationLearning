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

public class FetchDataFromVaryingCellInEachRow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String filePath = "../automation_selenium/testdata/FetchingExcelDataPractice.xlsx";
		//To copy the file from the specified path
		FileInputStream inputStream = new FileInputStream(filePath);
		//To open excel file
		Workbook book =WorkbookFactory.create(inputStream);
		//To identify the specifies sheet in the excel file
		Sheet sheet  = book.getSheet("Practice1");
		int totalRow = sheet.getLastRowNum();
		for (int i = 0; i <= totalRow; i++) {
			Row row = sheet.getRow(i);
			System.out.print("Row"+i+" cell values: ");
			short totalCell = row.getLastCellNum();
			for (short j=0; j < totalCell; j++) {
				Cell cell=row.getCell(j,org.apache.poi.ss.usermodel.Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
				//Cell cell=row.getCell(j);
				if(cell.getCellType() == CellType.STRING)
				{
					String cellValue = cell.toString();
					System.out.print(cellValue+" ");
				}				
				else if(cell.getCellType()== CellType.BLANK)
				{
					System.out.print(cell.getCellType()+" ");

				}
				else if(cell.getCellType() == CellType.NUMERIC) {					
					System.out.print(cell.getNumericCellValue()+" ");
				}
				else if(cell.getCellType() == CellType.BOOLEAN)
				{
					System.out.print(cell.getBooleanCellValue()+" ");					
				}				
			}
			System.out.println(" ");	
		}
	}

}
