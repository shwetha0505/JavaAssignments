package week4.day2;




import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement eleScroll = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(eleScroll).perform();
		String text = eleScroll.getText();
		System.out.println(text);
	    File scr = eleScroll.getScreenshotAs(OutputType.FILE);

File dest=new File ("./snap/amazon.png");
FileUtils.copyFile(scr, dest);

	

	}
}

