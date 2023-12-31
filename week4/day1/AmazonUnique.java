package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonUnique {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));				
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus Mobiles",Keys.ENTER);
		//find the list of mobilePrices
		
		List<WebElement> allPrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//Create a list
		Set<Integer> unique = new TreeSet<Integer>();
		//Iterate through a for each loop
		for (WebElement each : allPrices) {
			//get the text of each mobilePrice
			String text = each.getText();//1,049
			//replace ',' from the text
			String replacedString = text.replaceAll(",", "");
			//convert the replaced String to int data type 
			int mobilePrices = Integer.parseInt(replacedString);
			//add the mobile prices into the list
			unique.add(mobilePrices);
		}
		
		System.out.println(unique);
		
		//Print unique mobile prices,get the least mobilePrice,check whether duplicates present or not
		List<Integer> list = new ArrayList<Integer>(unique);
		System.out.println("The least mobile price is :"+list.get(0));
		
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
