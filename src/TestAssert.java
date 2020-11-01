

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class TestAssert {

		 WebDriver driver;
		 
		 @BeforeTest

		 public void openbrowser(){
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/"); 
		
	}
		 @Test(priority=1)
		 public void VerifyTitle(){
		
			 
		String actualtext = driver.findElement(By.xpath("//h2[@class='_8eso']")).getText();
		  
		String Expectedtitle= "Connect with friends and the world around you on Facebook.";
		Assert.assertEquals(actualtext, Expectedtitle);
		  
		  System.out.println(actualtext);
		 }

		}

