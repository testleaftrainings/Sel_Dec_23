package week8.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {
	
	public static void main(String[] args) throws IOException {
		
		// Step 1: Set up the report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		//Step 2: Create object for ExtentReports
		ExtentReports extent = new ExtentReports();
		
		//Step 3: attach the data with the file
		extent.attachReporter(reporter);
		
		//Step 4: Create a test case and assign all the test details
		                                //  testcasename   testDescription
		ExtentTest test = extent.createTest("CreateLead", "CreateLead with mandatory details");
		//assign category
		test.assignCategory("smoke");
		test.assignAuthor("Subraja");
		
		//Step 5: Step level status
		test.pass("Username is entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/amazon.png").build());
		test.pass("Password is entered successfully");
		test.pass("Login is successfull");
		
		ExtentTest test1 = extent.createTest("EditLead", "Edit the lead which is created");
		//assign category
		test1.assignCategory("regression");
		test1.assignAuthor("Subraja");
		
		//Step 5: Step level status
		test1.pass("Username is entered successfully");
		test1.fail("Password is not entered successfully");
		test1.fail("Login is not successfull");
		
		//Step 6: Mandatory 
		extent.flush();
		
		System.out.println("Done");
		
		
	}

}
