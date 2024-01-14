package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// Open the workbook and mention the file path
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		//Enter into a specific sheet by the index / sheetname
		XSSFSheet sheet = wb.getSheetAt(0);
		//get the rowCount
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total no:of rows: "+rowCount);
		//get the columnCount
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total no:of columns: "+columnCount);
		
//		XSSFRow row = sheet.getRow(2);
//		XSSFCell cell = row.getCell(3);
//		String singleData = cell.getStringCellValue();
//		System.out.println(singleData);
		
		//iterate through the rows and columns
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j); //[1][3]
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
			
		}
		
		
		
		

	}

}
