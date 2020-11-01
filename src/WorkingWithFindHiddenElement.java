import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.facebook.com/");
		//waiting for the page to be loaded
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		List<WebElement>numbersOfElements = driver.findElements(By.tagName("input"));
		//Getting input tag and store in list variable name "numbersOfElements"
		System.out.println(numbersOfElements.size());
		//print total number of hidden elements
		
		for(int i=0;i<numbersOfElements.size();i++) {
			//print total number of tag
			//equalsIgnorecase doesn't matter if its upper case or lower case
			if(numbersOfElements.get(i).getAttribute("type").trim().equalsIgnoreCase("hidden")) {
				//check for empty text
				if(!(numbersOfElements.get(i).getAttribute("value").trim().isEmpty())) {
				//trim-allows you to ignore empty text
				System.out.println("Hidden Element Text= " + i + " "+ numbersOfElements.get(i).getAttribute("value").trim());
				}
			}	
		}

	}
}
