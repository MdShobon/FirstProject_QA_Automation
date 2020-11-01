import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImages {  //count the link

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
			
		driver.get("https://www.nydailynews.com/");
		
		// count the source of picture that how many picture this age has
		
		List<WebElement>image=driver.findElements(By.tagName("img"));
		System.out.println(image.size());
		for(int i=0;i<image.size();i++){
		System.out.println(image.get(i).getAttribute("src"));
	}

}
}

	
