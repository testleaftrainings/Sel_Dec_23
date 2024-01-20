package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//WebElement ele = driver.findElement(By.xpath("//span[text()='I am here']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(text);
	}

}
