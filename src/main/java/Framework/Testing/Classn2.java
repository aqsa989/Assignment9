package Framework.Testing;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Classn2 {

	@AfterSuite
	public void test5()
		
		{
			System.out.println("Test 5 has been generated");
		}
	
	@Test
	public void test6()
		
		{
			System.out.println("Test 6 has been generated");
		}
	
	@Test
	public void test7()
		
		{
			System.out.println("Test 7 has been generated");
		}
	
	@BeforeSuite
	public void test8()
		
		{
			System.out.println("Test 8 has been generated");
		}
}

