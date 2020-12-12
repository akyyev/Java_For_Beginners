package Beginner.day61_ExcelReadWrite;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelRead {
	public static void main(String[] args) throws Exception {
		
		String filePath ="/Users/Desktop/TestData.xlsx";  // path of excel file

		String sheetName = "Sheet1";  // Name of the sheet

		FileInputStream file = new FileInputStream(filePath); // reads a file

		Workbook excelFile = WorkbookFactory.create(file); // specially designed for Excel Files


		Sheet sheet =  excelFile.getSheet(sheetName);  // gets the specific spread sheet from excelfile


		Cell cell = sheet.getRow(1).getCell(2); // retrieves specific cell from the spreadsheet


		String cellData = cell.toString();  // converts the cell' value to String data type

		System.out.println(cellData);
			
		
	}

}
