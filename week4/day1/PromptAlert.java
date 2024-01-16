package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.leafground.com/alert.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		d.findElement(By.xpath("//h5[contains(text(),'Prompt')]/following::button")).click();
	    Thread.sleep(3000);
		Alert prompt=d.switchTo().alert();
		prompt.sendKeys("Shwe");
		prompt.accept();
		

	
     WebElement text=d.findElement(By.id("confirm_result"));
     String t2=text.getText();
	if (t2.contains("entered")) {
		System.out.println("Prompt Alert Successfully");
	}

		
	}

}
