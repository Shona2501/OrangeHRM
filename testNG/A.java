package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class A {
	
	 @BeforeTest
	  public void beforeTest() 
	 {
		 System.out.println("Client-A");
	  }
	
  @Test
  public void parallel_A() 
  {
	  System.out.println("Developer-A");
  }
 
  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Tester-A");
  }

}
