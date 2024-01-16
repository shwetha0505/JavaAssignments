package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeDriver d=new EdgeDriver();

		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("Oneplus pro",Keys.ENTER);
		String price = d.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(price);
		WebElement star = d.findElement(By.xpath("//i[contains(@class,'a-icon a-icon-star-small')]"));
        //String st=star.getText();
        Actions a=new Actions(d);
        a.moveToElement(star).perform();
        Thread.sleep(1000);
	    String rating= d.findElement(By.xpath("//i[@class='a-icon a-icon-star a-star-4-5']/following-sibling::span")).getText();
		System.out.println("The mobile rating is :"+rating);
		d.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base a')]")).click();
		Thread.sleep(1000);
        Set<String> window = d.getWindowHandles();
		
		List<String> handles = new ArrayList<String>(window);
		d.switchTo().window(handles.get(1));
		WebElement mob=d.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		File scr = mob.getScreenshotAs(OutputType.FILE);

		File dest=new File ("./snap/amazononeplus.png");
		FileUtils.copyFile(scr, dest);

		WebElement ele = d.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		//ele.click();
		d.executeScript("arguments[0].click();", ele);
		WebElement subtotal = d.findElement(By.id("attach-accessory-cart-subtotal"));
	
		Actions act=new Actions(d);
		d.executeScript("arguments[0].click();", subtotal);
		act.scrollToElement(ele).perform();
		
		String total=subtotal.getText();
		System.out.println("Total:"+total);
		if (total.contains(price)) {
			
			System.out.println("Both are equal");
			
		}
		else
			System.out.println("Different product");
		
		//d.findElement(By.id("attach-close_sideSheet-link")).click();
		d.close();
	    d.switchTo().window(handles.get(0));
	    d.close();
		
	}

}
