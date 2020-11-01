import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		//this is the site link - //the-internet.herokuapp.com/basic_auth just add user name and pass admin@admin@ as used admin pass and user name 
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String textverify=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
		System.out.println(textverify);
		
		
	}

}
