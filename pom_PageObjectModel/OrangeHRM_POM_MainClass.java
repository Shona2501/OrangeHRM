package pom_PageObjectModel;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OrangeHRM_POM_MainClass {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Details: \n Enter 1 for Google Chrome \n Enter 2 for Internet Explorer");
		int choice= sc.nextInt();
		
		WebDriver driver = null;
		
		switch(choice)
		{
		case 1:
			System.out.println("*******Welcome to Google Chroome******");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
			
		case 2:
			System.out.println("*******Welcome to Internet Explorer");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\geckodriver.exe");
			driver = new InternetExplorerDriver();
			break;
			
			default :
				System.out.println("Invalid Selection...");
		}
		
		
		Thread.sleep(5000);
		
		
		OrangeHRM_POM o=new OrangeHRM_POM();
		o.maximize(driver);
		o.url(driver);
		Thread.sleep(2000);
		o.enterUsername(driver, "Admin");
		o.enterPassword(driver, "admin123");
		o.clickOnLogin(driver);
		o.clickOnWelcomeAdmin(driver);
		Thread.sleep(2000);
		o.clickOnLogout(driver);
		Thread.sleep(2000);
		o.closeBrowser(driver);
		sc.close();
	}

}
