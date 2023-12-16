package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementInteraction {

	public static void main(String[] args) {
		/**
		 * to interact with a webelement
		 * 1st step -> locate the element(find the element from the DOM)
		 * 2nd step -> Do the neccessary action with the WebElement(click(),sendKeys())
		 * 
		 * Basic Locators:
		 * id
		 * name
		 * className
		 * linkText
		 * partialLinkText -> if the linkText is having trailing and leading whitespaces/ if the linkText is too long
		 * 
		 * to locate the element -> findElement()
		 * to type in a input field -> sendKeys()
		 * to click on a WebElement -> click()
		 * 
		 * the return type of findElement() -> WebElement(Interface)
		 * 
		 */
	
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to get the current window title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		
	
		
		//close the browser
		//driver.close();
		
	}

}
