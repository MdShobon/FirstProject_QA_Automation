import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Firefoxxxx {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\shobon\\Desktop\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
			
		//driver.get  // you can use navigate for use more fuction like dynamic way 
		
		//Driver.navigate().to(“”)-same as get url
		//Driver.navigate().refresh()-reload or refresh the page
		//Driver.navigate().back()-back to previous page
		//Driver.navigate().forward()-go to the next page
		
		
		driver.navigate().to("https://www.facebook.com/reg/");
		//driver.navigate().refresh();
		
		driver.findElement(By.name("firstname")).sendKeys("Md");
		driver.findElement(By.name("lastname")).sendKeys("Shobon");
		
		//Select month = Select
		//month.selectByVisibleText("Feb");
		
		
		
		//Thread.sleep(3000);
		driver.close();
	}

}
