package pom_PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reclance_POM {
	
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}

	public void url(WebDriver driver)
	{
		driver.get("https://reclance.com/dev/admin/auth/login");
	}
	
	public void enterUsername(WebDriver driver, String usn) {
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(usn);
	}

	
	public void enterPassword(WebDriver driver, String pwd) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
	}
	
	
	public void clickOnLogin(WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
	
//	public void clickOnMenuBar(WebDriver driver) {
//		driver.findElement(By.cssSelector("/html/body/div/nav")).click();
//	}
	public void clickOnLogout(WebDriver driver) {
		driver.findElement(By.xpath("/html/body/div/nav/ul[1]/li[4]/a")).click();
	}

	
	
	public void closeBrowser(WebDriver driver) {
		driver.close(); 
	}

	

}
