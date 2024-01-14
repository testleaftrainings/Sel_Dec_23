package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataIntegration {

	public static String[][] readExcel(String excelFileName) throws IOException {
		// Open the workbook and mention the file path
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		//Enter into a specific sheet by the index / sheetname
		XSSFSheet sheet = wb.getSheetAt(0);
		//get the rowCount
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total no:of rows: "+rowCount);
		//get the columnCount
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total no:of columns: "+columnCount);
		
		String[][] data = new String[rowCount][columnCount];	
		
		//iterate through the rows and columns
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j); //[1][3]
				String readData = cell.getStringCellValue();
				data[i-1][j]=readData;//data[1-1][0]=TestLeaf
			}
			
		}
		
		wb.close();
		return data;
		

	}

}
