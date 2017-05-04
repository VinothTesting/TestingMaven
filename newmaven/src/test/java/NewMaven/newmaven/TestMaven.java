package NewMaven.newmaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMaven {

	@Test
	  public void verify() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty(
		         // FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,
		        //  "true");
		
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.close();
	}
}
