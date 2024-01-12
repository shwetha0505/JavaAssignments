package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		WebElement text=driver.findElement(By.className("route-bar-breadcrumb"));
		String title=text.getText();
		if (title.contains("Dashboard")) {
			System.out.println("The page is loaded successfully");
		}
		else
			System.out.println("Error");
		driver.navigate().back();

	WebElement b2=driver.findElement(By.xpath("//div[@class='card']/following::button"));
	if(b2.isEnabled()==false)
	{
		System.out.println("Button is disabled");
	}
	else
		System.out.println("Error");
	
WebElement b3=driver.findElement(By.xpath("(//div[@class='card']/following::button)[2]"));
System.out.println(b3.getText());
Point position = b3.getLocation();
System.out.println("The postion of submit button is:"+position);

WebElement b4=driver.findElement(By.xpath("//span[text()='Save']"));
String color = b4.getCssValue("background");
System.out.println("The name of the button:"+b4.getText()+ "\n" +color);

WebElement b5=driver.findElement(By.xpath("//span[text()='Submit']"));
System.out.println("The height of width of the button:"+b5.getSize());
driver.close();
}}
