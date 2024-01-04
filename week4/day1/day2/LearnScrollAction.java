package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollAction{
	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleScroll = driver.findElement(By.xpath("//span[contains(text(),'Amazon.com')]"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(eleScroll).perform();
		String text = eleScroll.getText();
		System.out.println(text);
		//to take screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/amazon.png");
		FileUtils.copyFile(source, dest);
		
		
		

	}
}
