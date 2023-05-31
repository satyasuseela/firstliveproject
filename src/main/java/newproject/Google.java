package newproject;



	import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



	public class Google {

public  static void main(String args[])
{
    WebDriver driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    
   driver.get("https://www.google.com");
 WebElement element=  driver.findElement(By.id("APjFqb"));
 element.sendKeys("Satya");
 element.click();
 
 driver.findElement(By.xpath("//span[text()='Satya']")).click();
}
}