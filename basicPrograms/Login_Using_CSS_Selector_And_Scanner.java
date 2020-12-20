package basicPrograms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Using_CSS_Selector_And_Scanner {
	
	//Note: 
	//CSS selector: Cascading style sheet
	//Syntax: TagName[PropertyName= 'PropertyValue']
	//For Example: input[type='Submit']

	public static void main(String[] args) throws Exception
	{
		//Using Scanner to access the website
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you Username");
		String unm=sc.next();
		System.out.println("Enter you Password");
		String pwd=sc.next();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		

		
	//driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
	//driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys(unm);
		driver.findElement(By.cssSelector("input[autocomplete='off']")).sendKeys(pwd);

		driver.findElement(By.cssSelector("input[type='Submit']")).click();

		driver.findElement(By.cssSelector("a[id='welcome']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='/index.php/auth/logout']")).click();
		Thread.sleep(2000);
		driver.close();
		sc.close();

	}

}
