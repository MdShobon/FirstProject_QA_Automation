
import static org.testng.Assert.assertEquals;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class ActionItem9302020 {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	@BeforeTest
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	@Test(priority=1)
	public void register() {
		//CSS Selector and Action to mouse click on login icon
		Actions actionPerform = new Actions(driver);
		WebElement Event = driver.findElement(By.cssSelector(".fa.fa-user.nosel"));
		actionPerform.doubleClick(Event).build().perform();
		//soft assert
		String expected = driver.findElement(By.cssSelector(".fa.fa-user.nosel")).getAttribute("onclick");
		String actual =  "showloginovl();";
		sa.assertEquals(actual, expected);
		System.out.println(expected);
		//Register Button
		driver.findElement(By.cssSelector(".anewuser1")).click();
	}
	@Test(priority=2, dataProvider="reginfo")
	public void EnterInformation(String username, String email, String pass1, String pass2)  {
		//Enter User Information To Register
		//username
		driver.findElement(By.cssSelector("input[id='reguser']")).sendKeys(username);
		//email
		driver.findElement(By.cssSelector("input[id='regmail']")).sendKeys(email);
		//password
		driver.findElement(By.cssSelector("input[id='regpass1']")).sendKeys(pass1);
		//password confirm
		driver.findElement(By.cssSelector("input[id='regpass2']")).sendKeys(pass2);
		//click on Register
		driver.findElement(By.cssSelector(".spbtn10.fl.mgright_20")).click();
		//click done
		driver.findElement(By.cssSelector(".fa.fa-times")).click();
	}
	@Test(priority=3)
	public void search() {
		//search
		driver.findElement(By.cssSelector("input[id='hps_input']")).sendKeys("Team Viewer");	
		//press enter keyboard click
		driver.findElement(By.cssSelector("input[id='hps_input']")).sendKeys(Keys.ENTER);
	}
	@Test(priority=4)
	public void scoll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;	//Java Script Language 
		// scroll by visible element to teamViewer version 15.10.5
		WebElement element = driver.findElement(By.cssSelector("a[title='TeamViewer Portable 15.10.5']"));
		js.executeScript("arguments[0].scrollIntoView();", element);		
	}
	@Test(priority=5)
	public void screenshot() throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\eclipse\\screenshots\\teamviewer.png"));
	}
	@Test(priority=6)
	public void hiddenLinksAndImages() {
		//images
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		for(int i=0; i<images.size(); i++) {
			System.out.println(images.get(i).getAttribute("src"));
		}
		//hidden elements
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int count = 0;
		for(int i=0;i<links.size();i++) {
			if(links.get(i).isDisplayed()) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(links.size()-count + "<-- Hidden");
	}
	@DataProvider
	public Object[][] reginfo(){
		//repeat 1 time
		// 4 parameters in data ([1][4])
		Object[][] data= new Object[1][4];
		data[0][0]="ProSmartMohammed"; 
		data[0][1]="mohammed@prosmart.com"; 				
		data[0][2]="thepasswordisPassword@";
		data[0][3]="thepasswordisPassword@";				
		return data;
	}
	@AfterTest
	public void close() {
		driver.close();
	}
}