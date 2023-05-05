package week4.day1.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags",Keys.ENTER);
	//driver.switchTo().alert().dismiss();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='Men']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
	Thread.sleep(2000);
	String itemCounts = driver.findElement(By.xpath("//div[@class='length']")).getText();
	System.out.println("Total number of items : " + itemCounts);
	List<WebElement> bagBrands = driver.findElements(By.className("brand"));
	for (WebElement webElement : bagBrands) {
	String brands = webElement.getText();
	System.out.println(brands);
	}
	List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
	System.out.println("----- Names of the Bags-----");
	for (WebElement webElement : bagNames) {
	String names = webElement.getText();
	System.out.println(names);
	}
	 Thread.sleep(5000);
	 driver.close();
   }
}
	

	
	

	


