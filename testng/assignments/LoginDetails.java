package testng.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginDetails extends RedHat {
	
	@BeforeTest
	public void values() {
		exfileName="LoginForm";
	}
	 
	@Test(dataProvider="sendData")
public void loginDetails(String uName,String pswd,String email,String num) {
		WebElement view=d.findElement(By.xpath("(//a[@id='rh-login-registration-link']//button)[1]"));
		d.executeScript("arguments[0].click();", view);
		String text=d.findElement(By.xpath("//h1[text()='Register for a Red Hat account']")).getText();
		if (text.contains("Register")) {
			System.out.println("Registration page loaded successfully");
		}
		else
		{
			System.out.println("Error loading the Registration page");
		}
		d.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys(pswd);
		d.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		d.findElement(By.xpath("//input[@label='Phone number']")).sendKeys(num);
		
		
	
	
	
	}
}
