import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftVerifyTest {

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
	
		 
	String actualTtext = driver.findElement(By.xpath("//a[@class='_8esh']")).getText();
	
	String expectedtext = "Create a Page";
	
	Assert.assertEquals(actualTtext, expectedtext);  //hard assert example 
	
	//soft Assert and hard  assert difference is 
	

	

	}

}
