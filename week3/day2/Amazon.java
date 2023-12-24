package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		//find the total number of links associated in this page
		
		ChromeDriver driver = new ChromeDriver();

		// Load the url
		driver.get("https://www.amazon.in/");

		//to maximize the window
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus Mobiles",Keys.ENTER);
		
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<String> list = new ArrayList<String>();
		for (WebElement each : allPrices) {
			String text = each.getText();
			list.add(text);
		}
		
		//to sort the list
		Collections.sort(list);
		System.out.println(list.get(0));
		
		
        
		
		
		
		

	}

}
