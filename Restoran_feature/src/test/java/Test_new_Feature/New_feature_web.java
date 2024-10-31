package Test_new_Feature;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class New_feature_web {
	  WebDriver driver;
	    WebDriverWait wait;
	    @Before
	public void SetUp () {
		 WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	        driver.get("https://veselka.com/");
	    }
	        @Test
	    	public void Restoran_test1() throws InterruptedException {
	        WebElement Order = driver.findElement(By.xpath("//li[contains(@class, \"orderlocally\")]"));
	        Order.click();						
	        WebElement Quantity= driver.findElement(By.xpath("//span[contains(text(), 'Chicken Noodle - Quart')]"));
	        Quantity.click();	
	        WebElement ButtomPay = driver.findElement(By.xpath("(//i[contains(@class, 'inline-block')])[3]"));
	        ButtomPay.click();
	        WebElement Payment =driver.findElement(By.xpath("//div[contains(@class,'actionWrapper primary')]"));
	        Payment.click();
	        Thread.sleep(2000);
	        WebElement Pay = driver.findElement(By.xpath("//a[contains(@class,'checkoutButton')]"));
	        Pay.click();
	    	}
	        @After
	        public void tearDown() {
	            if (driver != null) {
	                driver.quit();
	            }}


	     
	        
	        
	

	}


