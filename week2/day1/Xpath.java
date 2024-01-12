package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class Xpath {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();

driver.manage().window().maximize();




driver.get("http://leaftaps.com/opentaps/control/login");

String title=driver.getTitle();
System.out.println(title);

//System.out.println(driver.getTitle());
//driver.findElement(By.xpath("//button[text()='Decline optional cookies']")).click();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@type='submit']")).click();
//driver.findElement(By.partialLinkText("Find your account and log in.")).click();
System.out.println(driver.getTitle());
//driver.close();


	}

}
