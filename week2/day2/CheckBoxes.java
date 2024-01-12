package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxes {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')]//span)[2]"));
		driver.executeScript("arguments[0].click();", ele);
		String output = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if (output.contains("Checked")) {
			System.out.println("Checkbox are selected");
			
		}
		else
			System.out.println("Unchecked");
		
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox-box ui-widget')])[3]")).click();
		driver.findElement(By.xpath("(//div[contains(@id,'ajaxTriState')]//div)[2]")).click();
		String state = driver.findElement(By.xpath("//span[text()='State has been changed.']")).getText();
		if (state.contains("changed")) {
			
			System.out.println("Tri state checkbox is clicked");
			
			
		}
		else
			System.out.println("Tri state not selected");
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String toggle = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		if (toggle.contains("Checked")) {
			System.out.println("Toggle is on");
		}
		boolean disabled = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isSelected();
	System.out.println("The checkbox is enabled:"+disabled);
	driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu')]//span[1]")).click();
	driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
driver.close();
}
}