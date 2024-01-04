package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDraggable{
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().frame(0);
		WebElement eleDrag = driver.findElement(By.id("draggable"));
		Actions act = new Actions(driver);
		Point location = eleDrag.getLocation();
		int x = location.getX();
		int y = location.getY();
		act.dragAndDropBy(eleDrag, x, y).perform();
		
		

	}
}
