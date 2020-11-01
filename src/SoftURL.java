import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftURL {


	 WebDriver driver;
	 
	 SoftAssert sa = new SoftAssert();
	 
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
		 
		 String url = driver.findElement(By.xpath("//a[@class='_8esh']")).getAttribute("href");
		 
		// System.out.println(url); //try to get the full url by execute  this code later u can use the full url in expecetd url
		 
		 String expectedurl = "https://www.facebook.com/pages/create/?ref_type=registration_form";
		 sa.assertEquals(url, expectedurl);
		 
		 
		 sa.assertAll();   //soft assert example but why do i use for sa.assertall();
		 
		 // 
		 
		  

	}

}
