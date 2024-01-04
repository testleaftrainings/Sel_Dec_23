package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseAction{
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//locate the element 
		WebElement elePrime = driver.findElement(By.xpath("//span[text()='Prime']"));
		//Instantiate Actions class
		Actions builder = new Actions(driver);
		//using the object call the required methods
		builder.moveToElement(elePrime).perform();
		

	}
}
