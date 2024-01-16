package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		d.findElement(By.xpath("//div[text()='Accept all & visit the site']")).click();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       d.switchTo().frame("iframeResult");
       
		d.findElement(By.xpath("//button[text()='Try it']")).click();
	    
		Alert confirm=d.switchTo().alert();
		String text = confirm.getText();
		System.out.println(text);
		confirm.accept();
		String text2 = d.findElement(By.xpath("//p[@id='demo']")).getText();

		System.out.println("Text displayed:"+text2);
		if (text2.contains("Harry")) {
			System.out.println("Alert dismissed Successfully");
		}
		
		
		

	}

}
