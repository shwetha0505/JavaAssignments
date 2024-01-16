package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling{
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//p[text()='Consent']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String pTitle = driver.getTitle();
		System.out.println("Parent Title: "+pTitle);
		
		String pWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window handle is : "+pWindowHandle);
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
		//driver.findElement(By.xpath("//div[@class='modal-content']/following::button")).click();

		String cTitle = driver.getTitle();
		System.out.println(cTitle);


		if (!pTitle.equals(cTitle)) {
			System.out.println("Control switched to the new Window");
		}
		else {
			System.out.println("Control stays in the same Window");
		}
	
		driver.switchTo().window(handles.get(0));
		driver.close();
		
		
		

	}
}

