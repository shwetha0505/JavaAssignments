package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//button[text()='NOT NOW']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']//span")).click();
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		List<WebElement> sshoes= driver.findElements(By.tagName("a"));
		 int size = sshoes.size();
	    System.out.println("Sport shoes:"+size);
	    
	    driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	    driver.findElement(By.xpath("//div[@class='sort-drop clearfix']")).click();
	    driver.findElement(By.xpath("//li[@class='search-li sort-active']/following-sibling::li[1]")).click();
	   WebElement click = driver.findElement(By.xpath("//a[contains(@class,'price-slider-scroll right-handle')]"));
	    Actions action=new Actions(driver);
	    action.dragAndDropBy(click, -175, 0).perform();
		
	   // driver.findElement(By.xpath("(//div[@class='price-input']/following-sibling::div)[2]")).click();
	    WebElement ele = driver.findElement(By.xpath("//a[text()=' White & Blue']"));
	    driver.executeScript("arguments[0].click();", ele);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//source[@class='product-image']//following::img")).click();
	    
        WebElement view = driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]"));
        driver.executeScript("arguments[0].click();", view);
        Actions act=new Actions(driver);
        act.moveToElement(view).perform();
        Set<String> window= driver.getWindowHandles();
		
		List<String> handles = new ArrayList<String>(window);
		driver.switchTo().window(handles.get(1));
		driver.findElement(By.xpath("//div[text()='Decline All']")).click();
		String price=driver.findElement(By.xpath("//span[@class='pdp-final-price']")).getText();
		System.out.println("Shoe price :"+price);
		String dis = driver.findElement(By.className("pdpDiscount")).getText();
	    
	    System.out.println("Discount percentage:"+dis);
	   WebElement shoe= driver.findElement(By.xpath("//img[@class='cloudzoom']"));
	    File scr=shoe.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./snap/snapdeal.png");
	    FileUtils.copyFile(scr,dest);
	    driver.close();
	    driver.switchTo().window(handles.get(0));
	    //driver.close();
	    

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
