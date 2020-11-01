import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngSample {

	//pre-condition
	
	@BeforeTest
	
	public void openbrowser() {
		System.out.println("Browser openned");
	}
	@Test(priority=1)
	public void Registration() {
		System.out.println("User is able to register");
	}
	
	@Test(priority=2)
	public void Login() {
		System.out.println("User is able to register");
	}
		@Test(priority=3)
		public void RegisterAddress() {
			System.out.println("User is able to register Address");
	}
		
		
		@Test(priority=5)
		public void ProfileCreation() {
			System.out.println("User is able to Create a Profile");
	}
		
		@Test(priority=4)
		public void SignOff() {
			System.out.println("User is able to Sign Out");
	}
		
		//post condiyion
		
		@AfterTest
	
		public void closebrowser() {
			System.out.println("Closing browser");
	}
}
	