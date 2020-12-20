package hybridDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalClass {
	
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	public void url(WebDriver driver)
	{
		driver.get("http://frontaccounting.squadinfotech.in/");
	}
	
	public void enterUsername(WebDriver driver, String usn) {
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[3]/td[2]/input")).sendKeys(usn);
	}

	
	public void enterPassword(WebDriver driver, String pwd) {
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[4]/td[2]/input")).sendKeys(pwd);
	}
	
	public void selectCompany(WebDriver driver) {
		Select s= new Select(driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[5]/td[2]/select")));
		s.selectByIndex(0);	
	}
	
	public void clickOnLogin(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[2]/input")).click();
	}
	
	
	public void clickOnLogout(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]")).click();
	}

	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

}
