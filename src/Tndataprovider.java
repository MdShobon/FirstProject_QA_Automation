import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Tndataprovider {

		 WebDriver driver;
		 
		 @BeforeMethod

		 public void openbrowser(){
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("http://demosite.center/wordpress/wp-login.php"); 
		
	}
		 @Test(priority=1)
		 public void getPageTitle(){
		  String title = driver.getTitle();
		  System.out.println(title);
		  
		 }
		 @Test(priority=2, dataProvider="Demologin")
		 public void Login(String username, String password){
		  driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");
		  driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("password");
		  System.out.println("User able to Enter Info");
		  
		 }
		 @Test(priority=3)
		 public void ClickOnLogin(){
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  System.out.println("User able to Login");

}
		 
	@DataProvider(name="Demologin")
	public Object[][] passData()
	{
		Object[][] data=new Object[3][2];
		
				data[0][0]="admin";
				data[0][1]="demo123";
				
				data[1][0]="admin123";
				data[1][1]="demo32343";
				
				data[2][0]="admin7867634";
				data[2][1]="demo23743473843";
				
				return data;
	}
}
	