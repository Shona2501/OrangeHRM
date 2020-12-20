package basicPrograms;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUsing_Xpath_DialogBox {
	//Note: X-path:XML path: Extensible Markup Language
	//Types of X-path:
	//1) Absolute XPath: It starts with ROOT NODE and its prefix is '/'
	//2) Relative XPath: It shows with CURRENT NODE and its prefix is '//'
	 	//Syntax: //TagName[@PropertyName= 'PropertyValue']
		//For Example: //input[@type='Submit']


	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		// DataType variable = class.method("message");
		String unm=JOptionPane.showInputDialog("Enter Username"); 
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys(unm);
		
		String pwd=JOptionPane.showInputDialog("Enter Password");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
		
		driver.close();



		
}

}
