package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {
	public static void main(String[] args) throws InterruptedException {
		/**
		 * frame1
		 *   frame2
		 *     frame3
		 *       frame4
		 * NoSuchFrameException       
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch the focus to the parent frame using WebElement
		WebElement eleFrame = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following::iframe"));
		driver.switchTo().frame(eleFrame);
		//switch to the nested frame
		driver.switchTo().frame("frame2");
		//click the button
		driver.findElement(By.id("Click1")).click();
		
		
		
	}
}
