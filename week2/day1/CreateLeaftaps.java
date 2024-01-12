package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeaftaps {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Shwetha");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	WebElement industry = driver.findElement(By.xpath("//span[text()='Industry']//following::select"));
	Select sec=new Select(industry);
	sec.selectByIndex(2);
	
	WebElement owner = driver.findElement(By.xpath("//span[text()='Ownership']//following::select"));
    Select sec1=new Select(owner);
	sec1.selectByVisibleText("S-Corporation");
	
	WebElement source = driver.findElement(By.xpath("//span[text()='Source']//following::select"));
	Select sec2=new Select(source);
	sec2.selectByValue("LEAD_EMPLOYEE");
	
	WebElement market = driver.findElement(By.xpath("//span[text()='Marketing Campaign']//following::select"));
	Select sec3=new Select(market);
	sec3.selectByIndex(5);
	
	WebElement state = driver.findElement(By.xpath("//span[text()='State/Province']//following::select"));
	Select sec4=new Select(state);
	sec4.selectByValue("TX");
	
	driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	String accountName = driver.findElement(By.xpath("//span[text()='Account Name']//following::span")).getText();
	if (accountName.contains("Shwetha")) {
		System.out.println("Name is correct");
		
	}
	else
		System.out.println("Name is incorrect");
	
	driver.close();
	
	
	}
	
	
	

}
