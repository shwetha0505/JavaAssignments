package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" https://www.leafground.com/radio.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement chrome = driver.findElement(By.xpath("(//label[text()='Chrome'])[2]"));
		chrome.click();
		
		boolean select = chrome.isEnabled();
		if (select==true) {
			System.out.println("Chrome is selected");
			
		}
		else
		{System.out.println("Not selected");
		}
		WebElement age=driver.findElement(By.xpath("//input[@id='j_idt87:age:1']"));
		boolean select1=age.isSelected();
		if(select1==true) {
			System.out.println("Age is selected");
		}
		else {
			System.out.println("Not selected");
		}
		
		
		


	
	}

}
