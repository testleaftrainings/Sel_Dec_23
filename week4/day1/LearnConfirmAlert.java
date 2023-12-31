package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmAlert {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//h5[contains(text(),'Confirm Dialog')]/following::span")).click();
		//switch the driver focus to the Confirm dialog box
		Alert confirmAlert = driver.switchTo().alert();
		String text = confirmAlert.getText();
		System.out.println("Alert Message : "+text);
		confirmAlert.dismiss();
		String text2 = driver.findElement(By.id("result")).getText();
		if (text2.contains("Cancel")) {
			System.out.println("Alert dismissed Successfully");
		}
		
	}
}
