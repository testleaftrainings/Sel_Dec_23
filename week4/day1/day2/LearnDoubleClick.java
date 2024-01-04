package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDoubleClick{
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame("iframeResult");
		WebElement eleDoubleClick = driver.findElement(By.xpath("//p[contains(text(),'Double-click')]"));
		Actions builder = new Actions(driver);
		builder.doubleClick(eleDoubleClick).perform();
		String text = driver.findElement(By.id("demo")).getText();
		if (text.contains("Hello")) {
			System.out.println("Action performed");
		}
		else {
			System.out.println("Action not Done");
		}
		

	}
}
