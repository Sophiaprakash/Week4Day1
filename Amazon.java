package week4.day1.assignments;


import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		String price = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println(price);
		
		driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]")).click();
		String rating = driver.findElement(By.xpath("//span[contains(@class,'text-beside-button a-text-bold')]")).getText();
		System.out.println("Star rating : " + rating);
		
		driver.findElement(By.xpath("(//a[@target='_blank'])[2]")).click();
		Set<String> windowHs = driver.getWindowHandles();
		List<String> whs=new ArrayList<String>(windowHs);
		driver.switchTo().window(whs.get(1));
		
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scrFile, new File("C:\\Users\\sophi\\OneDrive\\Desktop\\Testing\\screenshot.png"));
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
		String rate = driver.findElement(By.xpath("//span/span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']")).getText();
		System.out.println("SubTotal: "+ rate);
		Thread.sleep(5000);
		driver.quit();

	}

}
