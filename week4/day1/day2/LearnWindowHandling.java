package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling{
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//get the title of the parent window
		String pTitle = driver.getTitle();
		System.out.println("Parent Title: "+pTitle);
		//get the window handle
		String pWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle is : "+pWindowHandle);
		//click open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();	
		//to get all the windowhandles
		Set<String> windowHandles = driver.getWindowHandles();//pWindowHandle,childWindowHandle
		//Convert Set to List
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		//get the title of the childWindow
		String cTitle = driver.getTitle();
		System.out.println(cTitle);
		//verify
		if (!pTitle.equals(cTitle)) {
			System.out.println("Control switched to the new Window");
		}
		else {
			System.out.println("Control stays in the same Window");
		}
		driver.close();
		driver.switchTo().window(handles.get(0));
		System.out.println(driver.getTitle());
		
		

	}
}
