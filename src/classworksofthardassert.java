import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class classworksofthardassert {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	
	@BeforeTest
	public void open() {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/");
	}
	@Test(priority=1)
	public void verifyTitle() {
		//log in button text
		String actual = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).getText();
		String expected = "Log In";
		sa.assertEquals(actual, expected);
		System.out.println(actual);
		sa.assertAll();
	}
	@Test(priority=2)
	public void forgotpass() {
		//forgot password
		String act = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[3]/a")).getText();
		System.out.println(act);
		String exp = "Forgot Password?";
		sa.assertEquals(act, exp);
		sa.assertAll();
	}
	@Test(priority=3)
	public void fail() {
		//fail
		String ac = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[3]/a")).getText();
		System.out.println(1);
		String ex = "Forgot Password[]?";
		sa.assertEquals(ac, ex);
		sa.assertAll();
	}
	@Test(priority=4)
	public void hard() {
		//log in button text
		String actual = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).getText();
		System.out.println(actual);
		String expected = "Log In";
		Assert.assertEquals(actual, expected);
	}
	//Hard Assert
	@Test(priority=5)
	public void hardFail() {
		//forgot password
		String act = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[3]/a")).getText();
		System.out.println(act);
		String exp = "Forgot Password//?";
		Assert.assertEquals(act, exp);
	}
	@Test(priority=6)
	public void passagain() {
		//fail
		String ac = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[3]/a")).getText();
		System.out.println(1);
		String ex = "Forgot Password?";
		sa.assertEquals(ac, ex);
		sa.assertAll();
	}
}


