package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnBasicXpath {

	public static void main(String[] args) {
		
	
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//to get the current window title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
		//enter password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//click Login Button
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		//click crmsfa link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//click leads link
		driver.findElement(By.xpath("//a[text()='lead']")).click();
		
		//click createlead link
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		//enter companyname
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TestLeaf");
		
		//enter firstname
		driver.findElement(By.xpath("(//span[text()='First name']/following::input)[1]")).sendKeys("Subraja");
		
		//enter lastname
		driver.findElement(By.xpath("(//span[text()='Last name']/following::input)[1]")).sendKeys("S");
				
		//click source dropdown
		WebElement sourceDD = driver.findElement(By.xpath("(//span[text()='Source']/following::select)[1]"));
	    Select sec = new Select(sourceDD);
	    //select cold call option from source dd
	    sec.selectByIndex(1);
	    
	    //click Industry dd
	    WebElement industryDD = driver.findElement(By.xpath("(//span[text()='Industry']/following::select)[1]"));
	    Select sec1 = new Select(industryDD);
	    sec1.selectByVisibleText("Finance");
	    
	    //click Marketing campaign dd
	    WebElement marketingCampaignDD = driver.findElement(By.xpath("//span[text()='Marketing Campaign']/following::select"));
	    Select sec2 = new Select(marketingCampaignDD);
	    sec2.selectByValue("CATRQ_ROADNTRACK");
	
		//click Submit button
	    driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
	    
		//close the browser
		//driver.close();
		
	}

}
