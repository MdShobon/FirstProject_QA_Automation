import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftHard {
	
	SoftAssert soft = new SoftAssert();

	 @Test
	 public void TestCase1(){
	  System.out.println("Lunch Site");
	  
	  //Assert.assertEquals(true, false); // hardAssert no need to create a object but softassert need it
	  
	  System.out.println("Verify title of the oage");
	 
	  soft.assertEquals(true, false);
	  
	  System.out.println("Entering Email");
	  
	  System.out.println("Entering Password");
	  
	  System.out.println("Clicking on the Sign Button");
	  
	  soft.assertAll();  //how importnat is login is (can be questioned at first day of work)

	}

}
