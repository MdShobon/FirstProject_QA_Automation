import java.util.List;    // hidden links

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {   // find hidden links 
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.cnn.com/");
		driver.manage().window().maximize();
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int count=0;
		for(int i=0;i<links.size();i++) {
			if(links.get(i).isDisplayed()) {   //find out the hidden links
				count++;
			}
				
		}
		System.out.println(count);
		System.out.println(links.size()-count);
		
	}

}
