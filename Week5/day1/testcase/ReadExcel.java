package week5.day1.testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readExcelData(String filename) throws IOException {
		//OPen the workbook  using filename and path
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+filename+".xlsx");
		//Go to the specific sheet (by sheet name/index)
		XSSFSheet wSheet = wb.getSheetAt(0);
		//Go to the specific row (by index)
		/*
		 * XSSFRow row = wSheet.getRow(2); // Go to the specific cell(by index) XSSFCell
		 * cell = row.getCell(3); //Read the content String cellData =
		 * cell.getStringCellValue(); //print the data
		 * System.out.println("Single data:"+cellData);
		 */
		//get rowCount
		int rowCount = wSheet.getLastRowNum();
		System.out.println("rowCount: "+rowCount);
		//get columnCount
		short columnCount = wSheet.getRow(0).getLastCellNum();
		System.out.println("columnCount : "+columnCount);
		
		//To get all the data iterate through the loop
		String[][] data = new String[rowCount][columnCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow eachRow = wSheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String allDatas = eachRow.getCell(j).getStringCellValue();
				System.out.println(allDatas);
				data[i-1][j]=allDatas;//data[1-1][0]
			}                   //data[1][0]="TestLeaf"
		}
		
		wb.close();
		return data;
		
		
	}

}
