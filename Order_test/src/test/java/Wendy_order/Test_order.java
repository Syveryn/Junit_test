package Wendy_order; 

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_order {
	  WebDriver driver;
	    WebDriverWait wait;
	@Before
  public void setUp() {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();
      wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      driver.manage().window().maximize();
      driver.get("https://www.wendys.com/");
      driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
      

	}
      @Test	
   public void Order() throws InterruptedException {
    	  WebElement Order = driver.findElement(By.xpath("//div[@class=\"brick brick--type--cta brick--id--30666 brick--cta en-us eck-entity\"]"));
    			  Order.click();
    			  Thread.sleep(3000);
    			  driver.navigate().refresh();
    			  Thread.sleep(3000);
                  Order = driver.findElement(By.xpath("(//div[@class=\"categories-list\"])[3]"));
                  Order.click();
                  Order =  driver.findElement(By.xpath("(//button[@class=\"fav-item-block\"])[1]"));
                  Order.click();
                  Order = driver.findElement(By.xpath("//button[@class=\"save-button national-menu\"]"));
                  Order.click();
               
    			  
    	  
	}
}
