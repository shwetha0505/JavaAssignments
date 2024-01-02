package week3.day2;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListOfBags {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver d=new ChromeDriver();

		d.get("https://www.ajio.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
        d.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
    
     d.findElement(By.xpath("//label[contains(text(),'Men ')]")).click();
     Thread.sleep(2000);
    WebElement fashion = d.findElement(By.xpath("//input[@id='Men - Fashion Bags']"));
    d.executeScript("arguments[0].click();", fashion);
    
     List<WebElement> brands=d.findElements(By.xpath("//div[@class='brand']//strong"));
     List<WebElement> bags=d.findElements(By.xpath("//div[@class='nameCls']")) ; 
    // WebElement noofbags=d.findElement(By.xpath("//strong[text()=' Items Found']"));
	int size= bags.size();
	System.out.println("The no.of bags:" +size);
	System.out.println("Bags are:");
     for (WebElement web : bags) {
		String b=web.getText();
		System.out.println(b);
		
	}
     System.out.println("Brands are:");
     for (WebElement webElement : brands) {
    	 String p=webElement.getText();
         System.out.println(p);
		
	}
		d.close();
		
	
	
	
	}

}
