import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenHostss {

	public static void main(String[] args) throws IOException {
		
		// take a screenshot? very imp interview question?
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.mortgagecalculator.org/");
		
		// this code have to be memorise interview question that how to take a screenshot from anything to save anywhere 
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile,  new File("C:\\Users\\shobon\\Desktop\\shobon143.jpg"));
		
		//driver.close();
	}

}
