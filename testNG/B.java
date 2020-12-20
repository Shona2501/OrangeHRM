package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class B {
	@BeforeTest
	  public void beforeTest() 
	 {
		 System.out.println("Client-B");
	  }
	
@Test
public void parallel_B() 
{
	  System.out.println("Developer-B");
}

@AfterTest
public void afterTest() 
{
	  System.out.println("Tester-B");
}

}
