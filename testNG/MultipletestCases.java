package testNG;

import org.testng.annotations.Test;

import pom_PageObjectModel.OrangeHRM_POM;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class MultipletestCases {
 
	WebDriver driver; 
	Select s;
 
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
	  driver=new ChromeDriver();
	  Thread.sleep(5000);
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
  }

  @Test(priority=2)  // Define which test case will execute first
  public void orangeHRM() throws Exception {
	  
	  OrangeHRM_POM o= new OrangeHRM_POM();
	
	  o.url(driver);
	  o.enterUsername(driver, "Admin");
	  o.enterPassword(driver, "admin123");
	  o.clickOnLogin(driver);
	  Thread.sleep(2000);
	  o.clickOnWelcomeAdmin(driver);
	  Thread.sleep(2000);
	  o.clickOnLogout(driver);  
	  
  }
  
  @Test(priority=2)
  public void blazeDemo() throws Exception {
	  
	  		//URL
			driver.get("https://blazedemo.com/");
			Thread.sleep(2000);
			
			//DropDown 1:
			s = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
			s.selectByIndex(5);
			Thread.sleep(2000);
			
			//DropDown 2:
			s= new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
			s.selectByValue("New York");
			Thread.sleep(2000);
			
			//Find Flight Button
			driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
			Thread.sleep(2000); 
	  
  }
  
  @Test (priority=1) // Define which test case will execute first
  public void google() throws Exception {
	  
	Thread.sleep(2000);
	driver.get("https://www.google.com/");
	
	//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("what is selenium webdriver");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	  
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
