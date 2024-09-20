package test_youtube1;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
public class test_youtube {
	@Test
	public void openyoutube() {
		 WebDriverManager.chromedriver().setup();
		   WebDriver driver = new ChromeDriver();
	        driver.get("https://www.youtube.com/");


	}

}
