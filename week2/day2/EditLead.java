package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("TCS");
		
		driver.findElement(By.xpath("(//span[text()='First name']/following::input)[1]")).sendKeys("Shwetha");
		
		driver.findElement(By.xpath("(//span[text()='Last name']/following::input)[1]")).sendKeys("AR");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Shwetha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Testing field");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("shwetha.ar@tcs.co.in");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("512");
	        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("201603062022");
		WebElement stDD = driver.findElement(By.xpath("//span[text()='State/Province']/following::select"));
		Select  state= new Select(stDD);
	    state.selectByVisibleText("New York");
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	 driver.findElement(By.xpath("//a[text()='Edit']")).click();
	 driver.findElement(By.xpath("//textarea[@name='description']")).clear();
	 driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("All details updated");
	 
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	String title1 = driver.getTitle();
	System.out.println("The page title is:"+title1);
	
	driver.close();
	
	    
	}

}
