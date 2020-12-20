package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDown_FA {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//URL
		driver.get("http://frontaccounting.squadinfotech.in/");
		
		System.out.println("\n\n LoginPage Title:"+driver.getTitle()); // display login page title name
		Thread.sleep(2000);
		
		//user-name
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("frontuser1");
		//Password
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("frontuser1");
		Thread.sleep(2000);
		
		//Dropdown: TagName should be  <select>
		// Step1: Select DropDwon --> Create object of select class
		Select s= new Select(driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[5]/td[2]/select"))); // dropdown value
		
		//Step2: Select Content of the dropdown
		//s.selectByIndex(2);
		//s.selectByvalue("2");
		s.selectByVisibleText("Squad_MT_OL_09");
		Thread.sleep(2000);
		
		// Login button
		driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[2]/input")).click(); // which dropdown you have to select that dropdown value
		
		System.out.println("\n\n HomePage Title:"+driver.getTitle()); // display home page title name

		
		//Logout button
		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[1]/td[3]/a[5]")).click(); //Example of absolute xPath
		Thread.sleep(2000);
		
		System.out.println("\n\n LogoutPage Title:"+driver.getTitle()); // display logout page title name

		
		//close browser
		driver.close();

	}

}
