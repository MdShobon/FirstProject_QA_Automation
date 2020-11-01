import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrow {
//headless means without the ui
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		//using method seleniuam webdriver and chrome driver 
		ChromeOptions options=new ChromeOptions(); // chrome has multiple option this is one of them this is an object 
		options.setHeadless(true);  // using set method  // headless always will be boolian true or false 
		WebDriver driver = new ChromeDriver(options);
			// what is the purpose of using headless method?
		// headless should be done after actual ui check after that it should be check 
		//you wont get real user behaviour if yuu run it headless methad 
		// first option should be do real ui not headless
		driver.get("https://www.amazon.com/");
		System.out.println("Title of the page"+driver.getTitle());  // i can use for any page to find the title 
	}

}
