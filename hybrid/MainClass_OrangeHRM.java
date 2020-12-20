package hybrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import keyword_Driven.ReadExcelClass;

public class MainClass_OrangeHRM {

	public static void main(String[] args) throws Exception {
	
		//Launch Browser + Import WebDriver class with ChromeDriver constructor
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				Thread.sleep(2000);
				
				ReadExcelClass r= new ReadExcelClass();
				
				r.readExcel(driver);

	}

}
