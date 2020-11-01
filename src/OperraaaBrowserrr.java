import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperraaaBrowserrr {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.opera.driver", "‪C:\\Users\\shobon\\Desktop\\operadriver.exe");

		WebDriver driver = new OperaDriver();
			
		driver.get("https://www.facebook.com/reg/"); 

	}

}
