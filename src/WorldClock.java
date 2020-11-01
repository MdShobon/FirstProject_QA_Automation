import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorldClock {
	
	//counts rows and table

	public static void main(String[] args) {
		
		//providing path of the chrome driver 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		
		//creating object to hold the chrome driver so we do not have to constantly call the 
		//chromedriver every time

		WebDriver driver = new ChromeDriver();
		
		//getting the url
			
		driver.get("https://www.timeanddate.com/worldclock/");
		
		//calling or getting the table element/locator 
		
		// first lets count how many coloam and rows we have here 
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		//using array list in java we are getting the row count and also calling the row locator 
		List<WebElement>rows=table.findElements(By.tagName("tr"));  //tr always rows 
		//using loop we are getting the size of the row 
		for(int i=0;i<rows.size();i++){
	
			List<WebElement>columns=rows.get(i).findElements(By.tagName("td")); //td alwats coloumns 
			// if u inspect big page or bunch of list most of the use "tagname" as findelement
			
			//using the look we are getting size of the column
		for(int j=0;j<columns.size();j++) {
			//using gettext ,method we are fetching text of the values within the table 
			System.out.println(columns.get(j).getText()+"  ");
		}
		//line break
		System.out.println();
		
	//System.out.println("Number of rows are"+rows);
	//System.out.println("Number of columns"+columns);
	}

}
}
