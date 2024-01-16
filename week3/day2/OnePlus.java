package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePlus {

	public static void main(String[] args) {
ChromeDriver d=new ChromeDriver();

d.get("https://www.amazon.in/");
d.manage().window().maximize();
d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
d.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("Oneplus Mobiles",Keys.ENTER);

List<WebElement> price = d.findElements(By.xpath("//span[@class='a-price-whole']"));
List<Integer> list=new ArrayList<Integer>();


for (WebElement each : price) {
	String t=each.getText();
	String replace=t.replaceAll(",", "");
	int mobileprice=Integer.parseInt(replace);
	list.add(mobileprice);
	
	
	Collections.sort(list);
	System.out.println(list);
	System.out.println(list.get(0));
	d.close();
}
	}

}
