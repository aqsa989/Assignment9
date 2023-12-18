package Framework.Testing;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Classn4 {

	@AfterSuite
	public void test11()
		
		{
			System.out.println("Test 11 has been generated");
		}
	
	@BeforeSuite
	public void test12()
		
		{
			System.out.println("Test 12 has been generated");
		}
	
}
