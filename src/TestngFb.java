import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngFb {
 
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
 public void getPageTitle(){
  String title = driver.getTitle();
  System.out.println(title);
  
 }
 @Test(priority=2)
 public void Login(){
  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testhfjdfhhd12@test.com");
  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("testps1233");
  System.out.println("User able to Enter Info");
  
 }
 @Test(priority=3)
 public void ClickOnLogin(){
  driver.findElement(By.xpath("//button[@name='login']")).click();
  System.out.println("User able to Login");
 }
 @AfterTest
 public void Close(){
 driver.close();
 }

}
