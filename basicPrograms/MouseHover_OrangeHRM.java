package basicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_OrangeHRM {

	public static void main(String[] args) throws Exception {
		// Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		// URL
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		// USername
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		
		//Password
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		
		//Login
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		//********* Mouse Hover***********
		//Step 1: Create object of Actions class
		Actions a = new Actions(driver);
		
		//Step 2: Create list with WebElement
		List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li"));
		
		//Step 3: Store last Module in one variable
		int size= ls.size();
		System.out.println("Number of Modules: "+size);
		
		
		// Step 3: Loop
		for(int i=1; i<=size; i++)
		{
			// wait
			Thread.sleep(2000);
			
			// Display Module name
			System.out.println(driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li["+i+"]")).getText());
			
			// Perform Mouse hover
			a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mainMenuFirstLevelUnorderedList\"]/li["+i+"]"))).click().perform();
		}
		

	}

}
