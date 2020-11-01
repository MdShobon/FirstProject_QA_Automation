import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com/reg/"); 
		// Get method actually going to url or web site
		
		//driver.findElement (By.name("email")).sendKeys("shovon_mpi@yahoo.com");
		//driver.findElement (By.name("pass")).sendKeys("Shovon1234partswicH");
		//driver.findElement (By.name("login")).click();
		//Thread.sleep(3000); // wait three second and close 
		
		//driver.close();
		driver.findElement (By.name("firstname")).sendKeys("md");
		driver.findElement (By.name("lastname")).sendKeys("shobon");
		driver.findElement (By.name("reg_email__")).sendKeys("testdata@agm.com");
		driver.findElement (By.name("reg_email_confirmation__")).sendKeys("testdata@agm.com");
		
		driver.findElement (By.name("reg_passwd__")).sendKeys("hopihbiunio");
	
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Feb");
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("4");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2019");
		
		driver.findElement(By.className("_58mt")).click();
		
		//driver.findElement(By.id("u_0_4)")).click();
	
		
	}

}
