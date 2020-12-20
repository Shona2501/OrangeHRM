package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown_BlazeDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Select s;  // Globally Declaration
		
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
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
		
		// CLose Browser
		driver.close();
		

	}

}
