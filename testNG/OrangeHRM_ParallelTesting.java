package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom_PageObjectModel.OrangeHRM_POM;

public class OrangeHRM_ParallelTesting {
	 
WebDriver driver;
	
	@BeforeTest
	public void beforeTest() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}	
	
  @Test
  public void oRangeHRM() throws Exception 
  {
	  OrangeHRM_POM o= new OrangeHRM_POM();
	  
	  o.url(driver);
	  Thread.sleep(2000);
	  o.enterUsername(driver, "Admin");
	  Thread.sleep(2000);
	  o.enterPassword(driver, "admin123");
	  Thread.sleep(2000);
	  o.clickOnLogin(driver);
	  Thread.sleep(2000);
	  o.clickOnWelcomeAdmin(driver);
	  Thread.sleep(2000);
	  o.clickOnLogout(driver);
	  
	  
	    
  }
 

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
