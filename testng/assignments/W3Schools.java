package testng.assignments;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class W3Schools {

	
		public ChromeDriver driver ;
		public String excelfileName;
		
		@Parameters({"url","year","month"})
		@BeforeMethod
		public void preCondition(String url,String eYear,String month) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("accept-choices")).click();
			driver.switchTo().frame("iframeResult");
			driver.findElement(By.xpath("//input[@id='expyear']")).sendKeys(eYear);
			driver.findElement(By.xpath("//input[@id='expmonth']")).sendKeys(month);



		}
		@DataProvider
		
		public String[][] sendData() throws IOException {
			return W3Integration.readData(excelfileName);
		}
		
		
		@AfterMethod
		public void postCondition() {
			driver.close();

		}
		
	

	}


