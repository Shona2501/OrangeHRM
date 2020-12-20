package pom_PageObjectModel;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FA_POM_MainClass {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Details: \n Enter 1 for Google Chrome \n Enter 2 for Internet Explorer");
		int choice= sc.nextInt();
		
		WebDriver driver = null;
		
		switch(choice)
		{
		case 1:
			System.out.println("*******Welcome to Google Chroome********");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
			
		case 2:
			System.out.println("*******Welcome to Internet Explorer**********");
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\geckodriver.exe");
			driver = new InternetExplorerDriver();
			break;
			
			default :
				System.out.println("Invalid Selection...");
		}
		
	
		Thread.sleep(5000);
		
		
		FA_POM f=new FA_POM();
		f.maximize(driver);
		f.url(driver);
		Thread.sleep(2000);
		f.enterUsername(driver, "frontuser1");
		f.enterPassword(driver, "frontuser1");
		f.selectCompany(driver,0);
		Thread.sleep(2000);
		f.clickOnLogin(driver);
		Thread.sleep(2000);
		f.clickOnLogout(driver);
		Thread.sleep(2000);
		f.closeBrowser(driver);
		sc.close();
		
	}


	}


