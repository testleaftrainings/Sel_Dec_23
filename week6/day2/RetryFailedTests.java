package week6.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{

	int count=0;
	public boolean retry(ITestResult result) {
		
//		int status = result.getStatus();
//		System.out.println("The status is : "+status);
		
		if (count<3) {
			count++;
			return true;//continue the retry
		}
		
		return false;//stop the retry
	}
	

}
