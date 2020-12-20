package testNG;

import org.testng.annotations.Test;

import pom_PageObjectModel.Reclance_POM;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Reclance_Testing {
	
	WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Thread.sleep(5000);
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 
	  } 
	 
  @Test(dataProvider = "dp")
  public void reclance(String username, String password) throws Exception {
	  
	  Reclance_POM r= new Reclance_POM();
	  
	  r.url(driver);
	  r.enterUsername(driver, username);
	  Thread.sleep(2000);
	  r.enterPassword(driver, password);
	  Thread.sleep(2000);
//	  r.clickOnMenuBar(driver);
//	  Thread.sleep(2000);
	  r.clickOnLogout(driver);
	  Thread.sleep(2000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	   new Object[] { "Superadmin", "12345"},
    	      new Object[] { "superadmin", "12345"},
    	      new Object[] { "superadmin", "12345"},
    	      new Object[] { "Admin", "12345"},
    	      new Object[] { "Superadmin", "12345"},
    	      
    };
  }
 
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
