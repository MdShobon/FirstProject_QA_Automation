import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException { //drop and drug
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);  //if it is ( iframe ) or frame on the page  then u need to stwich to  the frame 
		Actions action1 = new Actions(driver);
		
		
		
		WebElement dropElement = driver.findElement(By.id("draggable"));
		WebElement dropsourceElement = driver.findElement(By.id("droppable"));
		
		action1.clickAndHold(dropElement).moveToElement(dropsourceElement).release().build().perform();
		
		//driver.close();

	}

}
