import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_example {
	//implicit wait example // for apply for all 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		//driver.close();
		
		WebElement fn = driver.findElement(By.name("firstname"));
		WebElement in = driver.findElement(By.name("lastname"));
		
		sendKeys(driver, fn, 20, "java");
		sendKeys(driver, in, 20, "selenium");
		
		
	}
	
	//explicit wait example // apply for specific method 
	
	public static void sendKeys(WebDriver driver, WebElement locator, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(locator));
		locator.sendKeys(value);
	}

}
