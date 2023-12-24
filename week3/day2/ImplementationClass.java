package week3.day2;

import java.util.AbstractList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplementationClass {
	
	public static void main(String[] args) {
		SBIBank sbi = new SBIBank();
		sbi.cibilScore();
		sbi.housingLoan();
		
		 RBI rbi = new AxisBank();
		 rbi.cibilScore();
		 
		 RBI rb1 = new SBIBank();
		 rb1.cibilScore();
		 
		 WebDriver driver = new FirefoxDriver();
		 driver.get("");
		 
		
		 
		 ChromeDriver driver1 = new ChromeDriver();
		driver1.get("");
		 
		 
		 
		 
		
		
	}

}
