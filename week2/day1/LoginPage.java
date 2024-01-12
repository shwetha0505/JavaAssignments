package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();

driver.manage().window().maximize();




driver.get("https://www.facebook.com");

//String title=driver.getTitle();
//System.out.println(title);

System.out.println(driver.getTitle());
driver.findElement(By.xpath("//button[text()='Decline optional cookies']")).click();
driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Tuna@321");
driver.findElement(By.name("login")).click();
driver.findElement(By.partialLinkText("Find your account and log in.")).click();
System.out.println(driver.getTitle());
driver.close();


	}

}
