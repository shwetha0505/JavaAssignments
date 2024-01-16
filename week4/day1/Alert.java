package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//img[@loading='lazy']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
        Set<String> wHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(wHandles);
		driver.switchTo().window(handles.get(1));
		driver.findElement(By.id("pincodeInputId")).sendKeys("600053");
		driver.findElement(By.xpath("//span[text()='Check']")).click();
		String check=driver.findElement(By.xpath("//div[text()='Delivery by']")).getText();

		if (check.contains("out of stock")) {
			System.out.println("Currectly out of stock");
		}
		else
			System.out.println("Delivery available to the entered pincode");
		
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
		WebElement ele=driver.findElement(By.xpath("//div[text()='Remove']"));
		driver.executeScript("arguments[0].click();", ele);
		WebElement cancel=driver.findElement(By.xpath("//div[text()='Remove']"));
        Actions act=new Actions(driver);
        act.doubleClick(cancel).perform();
        Thread.sleep(2000);
        System.out.println("Action performed");
        String result=driver.findElement(By.xpath("//div[text()='Successfully removed MOTOROLA Edge 40 (Nebula Green, 256 GB) from your cart']")).getText();
        System.out.println(result);

       
        driver.close();
        driver.switchTo().window(handles.get(0));
		driver.close();
		
	}

}
