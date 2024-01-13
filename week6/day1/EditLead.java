package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class EditLead extends BaseClass{
	
	@DataProvider
	public String[][] sendData() {
		 String[][] data = new String[3][2];
		 
		 data[0][0]="91";
		 data[0][1]="TestLeaf";
		 
		 data[1][0]="92";
		 data[1][1]="Qeagle";
		 
		 data[2][0]="99";
		 data[2][1]="Infosys";
		 
		 return data; 

	}
	
	     //packagename.classname.methodname
	@Test(dataProvider = "sendData")//(dependsOnMethods = {"week6.day1.CreateLead.createLeadTestcase"},alwaysRun=true)
	public void editLeadTestcase(String pNo,String cName) throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}

	}

}
