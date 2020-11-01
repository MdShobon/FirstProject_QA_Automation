import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.gap.com/");
		
		//https://www.sjcny.edu/
			
			//https://www.freshdirect.com/
		
		//scroll by pixel or x,y coodinates
		//scroll by visible element 
		//scroll to bottom of the page 
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement closed = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/button"));
		if(closed.isDisplayed()) {
			closed.click();  // for pop up close code 
		}
		
		
		//JavascriptExecutor js = (JavascriptExecutor)driver; // object
		
		//scroll by pixel
		//visible elements
		//pixel bottom of the page 
		//js.executeScript("window.scrollBy(0, 1000)", ""); // this is the code for by pixel
		
		//for the visible by text you need element. for pixel you dont need anything except that line
		
		
		// use this one for make own xpath 
		////span[text()='Kindle book deals for you']
		
		//	WebElement anything = 
		//WebElement StockFood =driver.findElement(By.xpath("//*[@id=\"sec_wine_for_labor_day\"]/div/div[1]/div[2]/div/div/h3"));
		//js.executeScript("arguments[0].scrollIntoView();",StockFood);
		
		//i can use this code for anywhere to work with speific object or page and i have to make a own xpath if there is no locator
		
		//argumnet is value which pass thorugh the fucntion
	
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		//going to the bottom of the page 
	}

}
