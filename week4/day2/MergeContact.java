package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args)throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> whandles = new ArrayList<String>(windows);
		driver.switchTo().window(whandles.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		driver.switchTo().window(whandles.get(0));
		
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windows2 = driver.getWindowHandles();
		List<String> whandles2 = new ArrayList<String>(windows2);
		driver.switchTo().window(whandles2.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		driver.switchTo().window(whandles.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		String title = driver.findElement(By.xpath("//div[text()='View Contact']")).getText();
	System.out.println("The page title is:" +title);
	
	driver.close();
	}

}
