package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom_PageObjectModel.FA_POM;
import pom_PageObjectModel.OrangeHRM_POM;

public class DataDriven_OrangeHRM {
	
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() throws Exception 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		  driver=new ChromeDriver();
		  Thread.sleep(5000);
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
	  }
	
  @Test(dataProvider = "dp", priority= 2)
  public void fA(String username, String password) throws Exception 
  {
	  FA_POM f= new FA_POM();
	  
	  f.url(driver);
	  Thread.sleep(2000);
	  f.enterUsername(driver, username);
	  Thread.sleep(2000);
	  f.enterPassword(driver, password);
	  Thread.sleep(2000);
	  f.selectCompany(driver, 0);
	  f.clickOnLogin(driver);
	  Thread.sleep(2000);
	  f.clickOnLogout(driver);
	  
  }
  
  @Test(dataProvider = "dp", priority= 1)
  public void orangeHRM(String username, String password) throws Exception 
  {
	  OrangeHRM_POM o= new OrangeHRM_POM();
	  
	  o.url(driver);
	  Thread.sleep(2000);
	  o.enterUsername(driver, username);
	  Thread.sleep(2000);
	  o.enterPassword(driver, password);
	  Thread.sleep(2000);
	  o.clickOnLogin(driver);
	  Thread.sleep(2000);
	  o.clickOnWelcomeAdmin(driver);
	  Thread.sleep(2000);
	  o.clickOnLogout(driver);
	  
  }
  
  
  //Create your own DataProvider Annotation
//  @DataProvider
//  public Object[][] dp1()
//  {
//	  return new Object[][] {
//		  
//	  };
//  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "frontuser1", "frontuser1" },
      new Object[] { "Admin", "admin@123" },
      new Object[] { "sys", "system" },
      new Object[] { "Admin", "admin123" },
      new Object[] { "frontuser1", "frontuser1" },
    };
  }
 

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
