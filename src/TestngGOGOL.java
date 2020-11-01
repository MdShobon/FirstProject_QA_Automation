import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngGOGOL {

	
	WebDriver driver ;
	
	
	
@BeforeMethod
	
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

			@Test(priority=1)
		
		public void getPageTitle() {
			String title = driver.getTitle();
			System.out.println(title);


			
	}
			@Test(priority=2)
			public void GoogleSearch() {
				driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Shoes");
				System.out.println("User abel to Enter Info");
				
			}
			
			@Test(priority=3)
			public void ClickOnGoogleSearch() {
				driver.findElement(By.xpath("//input[@name='btnK']")).click();
				System.out.println("User able to see the search page");
}
			
}
