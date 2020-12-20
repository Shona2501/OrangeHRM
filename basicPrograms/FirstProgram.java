package basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	// Note: ctrl+shift+o: To import many classes at same time
	public static void main(String[] args) throws Exception 
	{
		
		// Step1: Select Browser
		// System.setProperty("Key","value");
		// system: class and setProperty("key","value"): Method 
		// Key: BrowserName
		// Value: BrowserPath
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe"); // "name of driver--> key", "value --> path ---> "
		
		// Step2: Create an object of WebDriver class with ChromeDriver Constructor
		
		WebDriver driver= new ChromeDriver();
		
		//wait
		Thread.sleep(5000);
		
		// maximize screen
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// open or access url
		driver.get("https://www.google.com");
		
		// close browser
		driver.close();

	}

}
