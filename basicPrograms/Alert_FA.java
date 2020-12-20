package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_PageObjectModel.FA_POM;

public class Alert_FA {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		
		//Create objects of FA_POM class
		FA_POM f= new FA_POM();
		f.maximize(driver);
		Thread.sleep(2000);
		f.url(driver);
		f.enterUsername(driver, "frontuser1");
		f.enterPassword(driver, "frontuser1");
		//f.selectCompany(driver);
		Thread.sleep(2000);
		f.clickOnLogin(driver);
		
		//Sales Quotation ENtry
		driver.findElement(By.linkText("Sales Quotation Entry")).click();
		
		Thread.sleep(2000);
		
		//Cancel Quotation Entry
		driver.findElement(By.xpath("//*[@id=\"CancelOrder\"]/span")).click();
		
		Thread.sleep(2000);
		
		//Alert: An alert in selenium is a small message box which appears on screen
		// To give the user some information or notification
		
		//Confirmation Alert:
		//Step1: Display Alert Message on Console
		System.out.println("Alert Message:"+driver.switchTo().alert().getText());
		Thread.sleep(2000);
		
		//Step2: Click on OK Button or
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		//Step2 : Click on Cancel button
		//driver.switchTo().alert().dismiss();
		//Thread.sleep(2000);
	}

}
