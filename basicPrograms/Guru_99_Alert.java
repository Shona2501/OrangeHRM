package basicPrograms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru_99_Alert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//URL
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		
		//Customer ID
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("1345");
		Thread.sleep(2000);
		
		//Click on submit
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		
		//Confirmation Alert:
				//Step1: Display Alert Message on Console
				System.out.println("Confirmation Alert Message:"+driver.switchTo().alert().getText());
				Thread.sleep(2000);
				
				//Step2: Click on OK Button or
				driver.switchTo().alert().accept();
				Thread.sleep(5000);
				//sc.close();
				
				//Step3: Simple Alert
				System.out.println("\n\n Simple Alert message:"+driver.switchTo().alert().getText());
				Thread.sleep(5000);
				driver.switchTo().alert().accept();
				
				Thread.sleep(2000);
				driver.close();
	}

}
