package Framework.Testing;

import org.testng.annotations.Test;


public class Classn1 {

	@Test(groups = "group1")
public void test1()
	
	{
		System.out.println("Test 1 function is returend");
	}
	
	@Test(groups = "group2")
	public void test2()
		
		{
			System.out.println("Test 2 function is returend");
		}
	
	@Test(groups = "group2")
	public void test3()
		
		{
			System.out.println("Test 3 function is returend");
		}
	
	@Test(groups = "group1")
	public void test4()
		
		{
			System.out.println("Test 4 function is returend");
		}
	
	@Test(groups = "group3")
	public void test5()
		
		{
			System.out.println("Test 5 function is returend");
		}
}
