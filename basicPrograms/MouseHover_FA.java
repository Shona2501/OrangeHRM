package basicPrograms;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	public class MouseHover_FA {

		public static void main(String[] args) throws Exception {
			// Launch browser
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			Thread.sleep(5000);
			driver.manage().window().maximize();
			
			// URL
			driver.get("http://frontaccounting.squadinfotech.in/index.php");
			
			// USername
			driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("frontuser1");
			
			//Password
			driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[4]/td[2]/input")).sendKeys("frontuser1");
			
			//Dropdown: TagName should be  <select>
			// Step1: Select DropDwon --> Create object of select class
			Select s= new Select(driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[1]/table/tbody/tr[5]/td[2]/select"))); // dropdown value
			
			//Step2: Select Content of the dropdown
			//s.selectByIndex(2);
			//s.selectByvalue("2");
			s.selectByVisibleText("Squad_MT_OL_09");
			Thread.sleep(2000);
			
			//Login
			driver.findElement(By.xpath("//*[@id=\"_page_body\"]/form/center[2]/input")).click();
			
			//********* Mouse Hover***********
			//Step 1: Create object of Actions class
			Actions a = new Actions(driver);
			
			//Step 2: Create list with WebElement
			List<WebElement> ls=driver.findElements(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a"));
			
			//Step 3: Store last Module in one variable
			int size= ls.size();
			System.out.println("Number of Modules: "+size);
			
			
			// Step 3: Loop
			for(int i=1; i<=size; i++)
			{
				// wait
				Thread.sleep(2000);
				
				// Display Module name
				System.out.println(driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a["+i+"]")).getText());
				
				// Perform Mouse hover
				a.moveToElement(driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td/table[1]/tbody/tr/td/table/tbody/tr/td/table[1]/tbody/tr/td/div/a["+i+"]"))).click().perform();
			}
			

		}

	}
