import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attachmentdrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "‪C:\\Users\\shobon\\Desktop\\operadriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		driver.get("http://automationpractice.com/index.php?controller=contact"); 
		
		driver.findElement(By.xpath("//*[@id=\"fileUpload\"]")).sendKeys("C:\\Users\\shobon\\Desktop\\testupload.txt");
	
		
	}

}
