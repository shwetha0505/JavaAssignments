package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccount {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));




driver.get("https://www.facebook.com");

//String title=driver.getTitle();
//System.out.println(title);

System.out.println(driver.getTitle());
driver.findElement(By.xpath("//button[text()='Decline optional cookies']")).click();
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("km");
driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abcnd@gmail.com");
driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abcnd@gmail.com");
driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Tuna@321");
WebElement date = driver.findElement(By.xpath("//span[@data-type='selectors']//select"));
Select sec = new Select(date);
sec.selectByVisibleText("15");

WebElement month = driver.findElement(By.xpath("(//span[@data-type='selectors']//select)[2]"));
Select sec1 = new Select(month);
sec1.selectByIndex(6);


WebElement yr = driver.findElement(By.xpath("(//span[@data-type='selectors']//select)[3]"));
Select sec2 = new Select(yr);
sec2.selectByValue("1996");
driver.findElement(By.xpath("//input[@name='sex']")).click();


driver.close();


	}

}
