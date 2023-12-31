package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));				
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus Mobiles",Keys.ENTER);
		//find the list of mobilePrices
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//Create a list
		List<Integer> list = new ArrayList<Integer>();
		//Iterate through a for each loop
		for (WebElement each : allPrices) {
			//get the text of each mobilePrice
			String text = each.getText();//1,049
			//replace ',' from the text
			String replacedString = text.replaceAll(",", "");
			//convert the replaced String to int data type 
			int mobilePrices = Integer.parseInt(replacedString);
			//add the mobile prices into the list
			list.add(mobilePrices);
		}
		//to sort the list
		Collections.sort(list);
		//print the list
		System.out.println(list);
		System.out.println("The lowest mobile price is : "+list.get(0));
		
		Set<Integer> unique = new TreeSet<Integer>(list);
		
		System.out.println("The size of list is :"+ list.size());
		System.out.println("The size of set is : "+ unique.size());
		
		if(unique.size()!=list.size()) {
			System.out.println("Duplicates Present");
		}
		else {
			System.out.println("Duplicates Not present");
		}
        
		
		
		
		

	}

}
