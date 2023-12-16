package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
/*
 * ChromeDriver  -> ChromeBrowser
 * EdgeDriver    -> EdgeBrowser
 * FireFoxDriver -> FirefoxBrowser
 * SafariDriver  -> SafariBrowser
 */
	public static void main(String[] args) {
		// Launch Chrome Browser
		// Create an Object for the ChromeDriver Class
		ChromeDriver driver = new ChromeDriver();
		
		// Load the url
		driver.get("https://www.amazon.in/");
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to get the current window title
		//String title = ;
		System.out.println(driver.getTitle());
		
		//close the browser
		driver.close();
		
	}

}
