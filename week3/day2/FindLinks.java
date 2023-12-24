package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		//find the total number of links associated in this page
		
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.facebook.com/");

		//to maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("")).sendKeys("Oneplus Mobiles",Keys.ENTER);
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for (WebElement each : allPrices) {
			String text = each.getText();
			System.out.println(text);
		}
		
		//to find all the links use findElements()
		List<WebElement> allLinks= driver.findElements(By.tagName("a"));
		
		//to find the size of the list
		int size = allLinks.size();
		System.out.println("The total number of links :"+size);
		
		//to get the 2nd link of this page
		WebElement singleLink = allLinks.get(1);
		String text = singleLink.getText();
		System.out.println(text);
		
		List<String> list = new ArrayList<String>();
		
		for (WebElement each : allLinks) {
			String text2 = each.getText();
			//System.out.println(text2);
			list.add(text2);
			
		}
		System.out.println(list);
		
		
		
		

	}

}
