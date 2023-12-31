package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch the focus to the frame using index
		driver.switchTo().frame(0);
		//click the element inside the frame
		driver.findElement(By.id("Click")).click();
        //to come out of all frames and switch back to the main page
		driver.switchTo().defaultContent();
		
		//switch the focus to the parent frame using WebElement
		WebElement eleFrame = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following::iframe"));
		driver.switchTo().frame(eleFrame);
		//switch to the nested frame
		driver.switchTo().frame("frame2");
		//click the button
		driver.findElement(By.id("Click")).click();

	}
}
