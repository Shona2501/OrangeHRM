package hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OperationalClass {

	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	public void url(WebDriver driver)
	{
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}
	
	public void enterUsername(WebDriver driver, String usn) {
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(usn);
	}

	
	public void enterPassword(WebDriver driver, String pwd) {
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(pwd);
	}
	
	
	public void clickOnLogin(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}
	
	
	public void clickOnWelcomeAdmin(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
	}
	
	
	public void clickOnLogout(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

	
}
