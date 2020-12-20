package pom_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FA_POM {

	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	public void url(WebDriver driver)
	{
		driver.get("http://frontaccounting.squadinfotech.in/index.php");
	}
	
	public void enterUsername(WebDriver driver, String usn) {
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[3]/td[2]/input")).sendKeys(usn);
	}

	
	public void enterPassword(WebDriver driver, String pwd) {
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[4]/td[2]/input")).sendKeys(pwd);
	}
	
	public void selectCompany(WebDriver driver, int i) {
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[5]/td[2]/select")).click();
	}
	
	public void clickOnLogin(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[2]/input")).click();
	}
	
	
	
	public void clickOnLogout(WebDriver driver) {
		driver.findElement(By.xpath("/")).click();//
	}

	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

}
