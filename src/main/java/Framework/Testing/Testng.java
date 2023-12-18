package Framework.Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testng {
	
	@Test
	public void checkout() throws InterruptedException
{
		
		   WebDriver driver;
	       System.setProperty("edge driver path","C:\\Users\\office\\Downloads\\edgedriver_win64");
	       driver=new EdgeDriver();
	       driver.get("https://www.saucedemo.com/");
	       driver.findElement(By.id("user-name")).sendKeys("standard_user");
	       driver.findElement(By.id("password")).sendKeys("secret_sauce");
	       driver.findElement(By.id("login-button")).click();

}
	}
