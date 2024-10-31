package test_youtube1;
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
public class test_youtube {
	  WebDriver driver;
	    WebDriverWait wait;
	@Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
	}
	@Test
	public void openyoutube() throws InterruptedException {
		WebElement language = driver.findElement(By.xpath("(//li[@class=\"gh-t gh-divider-l\"])[1]"));
		language.click();
		System.out.println("Daily deals");
		
	}
	@Test
	public void SearchField () throws InterruptedException {
	        WebElement searchField = driver.findElement(By.id("gh-ac"));
	        searchField.click();
	        searchField.sendKeys("Laptop",Keys.ENTER);
	    	System.out.println("search laptop");
	}
	@Test
	 public void SelectOption () throws InterruptedException {
		    WebElement TypeMemory = driver.findElement(By.id("gh-ac"));
		    TypeMemory.click();
	        TypeMemory.sendKeys("Laptop",Keys.ENTER);
	        TypeMemory = driver.findElement(By.xpath("//input[@class='checkbox__control' and @aria-label='64 GB']"));
	        TypeMemory.click();
	        WebElement ScreenSize = driver.findElement(By.xpath("//input[@class='checkbox__control' and @aria-label='10.5 in']"));
	        ScreenSize.click();
	    	System.out.println("Select size and skreen inch ");    
	}
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
           
	       



	}


    }}
