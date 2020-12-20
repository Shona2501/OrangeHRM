package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom_PageObjectModel.FA_POM;

public class FA_ParallelTesting {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	}	
	
  @Test
  public void fA() throws Exception 
  {
	  FA_POM f= new FA_POM();
	  
	  f.url(driver);
	  Thread.sleep(2000);
	  f.enterUsername(driver, "Admin");
	  f.enterPassword(driver, "admin123");
	  f.selectCompany(driver, 0);
	  f.clickOnLogin(driver);
	    
  }
 

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
