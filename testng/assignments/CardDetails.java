package testng.assignments;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CardDetails extends W3Schools{
	
	@BeforeTest
	public void setValues() {
		excelfileName="CheckoutForm";
	}
   @Test(dataProvider="sendData")
	public void cardDetails(String name,String ccnum,String cvv,String fname,String email,String add,String city,String zip,String state ) {
		driver.findElement(By.xpath("//input[@id='cname']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@id='ccnum']")).sendKeys(ccnum);
        driver.findElement(By.xpath("//input[@id='cvv']")).sendKeys(cvv);
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(fname);
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
	    driver.findElement(By.xpath("//input[@id='adr']")).sendKeys(add);
	    driver.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
	    driver.findElement(By.xpath("//input[@id='zip']")).sendKeys(zip);
	    driver.findElement(By.xpath("//input[@id='state']")).sendKeys(state);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();


}

}
