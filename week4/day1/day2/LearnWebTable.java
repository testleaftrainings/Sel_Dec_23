package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable{
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//locate table
		WebElement table = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody"));
		//find the number of rows
		List<WebElement> listOfRows = table.findElements(By.tagName("tr"));
		//rowCount
		int rowCount = listOfRows.size();
		System.out.println("Total  no: of Rows in this table : "+rowCount);
		
		//find the number of Columns
		List<WebElement> listofColumns = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]//th"));
		//columnCount
		int columnCount = listofColumns.size();
		System.out.println("Total no:of Columns : "+columnCount);
		
		//to print a single data
		String singleData = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[3]/td[2]")).getText();
		System.out.println(singleData);
		
		System.out.println("========================================");
		
		//to print datas from a specific row
		List<WebElement> secondRowDatas = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr[2]/td"));
		//iterate through a loop
		for (WebElement eachData : secondRowDatas) {
			System.out.println(eachData.getText());
		}
		
		
		System.out.println("========================================");
		
		//to print all datas from a single column
		List<WebElement> thirdColumnDatas = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td[3]"));
		for (WebElement each : thirdColumnDatas) {
			System.out.println(each.getText());
		}
		
		System.out.println("========================================");
		
		//to print all datas from the table
//		List<WebElement> allDatas = driver.findElements(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr/td"));
//		for (WebElement eachtableData : allDatas) {
//			System.out.println(eachtableData.getText());
//		}
		
		for (int i = 1; i <= rowCount; i++) {
			WebElement rows = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td"));
			for (int j = 1; j <=columnCount; j++) {
				WebElement datas = rows.findElement(By.xpath("//span[text()='Customer Analytics Table']/following::table[2]/tbody/tr["+i+"]/td["+j+"]"));
				String text = datas.getText();
				if(!text.isEmpty()) {
				System.out.println(text);
				}
			}
			
		}
		
		
		
		
		
		
		
	}
}