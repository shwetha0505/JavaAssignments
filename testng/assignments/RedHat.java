package testng.assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class RedHat {
	public ChromeDriver d ;
	public String exfileName;
	
	@Parameters("url")
	@BeforeMethod
	public void preCondition(String url) {

		 ChromeOptions options = new ChromeOptions();
	      options.addArguments("--disable-notifications");
	        
	     // ChromeDriver d = new ChromeDriver(options);
	    d = new ChromeDriver(options);
        d.manage().window().maximize();
	    d.get(url);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	@DataProvider
	
	public String[][] sendData() throws IOException {
		return RedhatIntegration.readData(exfileName);
	}
	
	
	@AfterMethod
	public void postCondition() {
		d.close();

	}
	

	
	
	
}
