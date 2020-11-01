
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class brosweFactory {

	public static WebDriver StartApplication(String browserName, String appURL)  
	{
		
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.getProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.getProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		
		{
			
			System.getProperty("webdriver.msedge.driver", System.getProperty("user.dir")+"/driver/msedgedriver.exe");
		driver=new EdgeDriver();
			
		}
		
	
	else if(browserName.equalsIgnoreCase("IE"))
		
	{
		
		System.getProperty("webdriver.IE.driver", System.getProperty("user.dir")+"/driver/IEDriverServer.exe");
	driver=new InternetExplorerDriver();	
		
	}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}

}
