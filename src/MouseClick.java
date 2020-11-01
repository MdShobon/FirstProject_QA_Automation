import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//performm certain action in selenium 
		
		Actions actionsperform = new Actions(driver);
		
	WebElement Event = driver.findElement(By.name("login")); // you can use xpath or class 
	
	actionsperform.doubleClick(Event).build().perform();
		
		
		

	}

}
