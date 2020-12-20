package keyword_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcelClass {
	
	public void readExcel(WebDriver driver) throws Exception
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Sonali\\Desktop\\Automation\\POI.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(file);
		XSSFSheet s= w.getSheet("KeywordDriven");
		
		int rowSize=s.getLastRowNum();
		System.out.println("No of Keywords: "+rowSize);
		
		OperationalClass o= new OperationalClass();
		
		for (int i=1; i<=rowSize; i++) 
		{
			// Store keywords
			String key = s.getRow(i).getCell(0).getStringCellValue();
			System.out.println(key);
			
			if(key.equals("MaximizeWindow"))
			{
				o.maximize(driver);
			}
			else if(key.equals("OpenApplication"))
			{
				o.url(driver);
			}
			else if(key.equals("EnterUsername"))
			{
				o.enterUsername(driver, "Admin");
			}
			else if(key.equals("EnterPassword"))
			{
				o.enterPassword(driver, "admin123");
			}
			else if(key.equals("ClickOnLoginButton"))
			{
				o.clickOnLogin(driver);
			}
			else if(key.equals("ClickOnWelcomeAdmin"))
			{
				o.clickOnWelcomeAdmin(driver);
				Thread.sleep(2000);
			}
		
			else if(key.equals("ClickOnLogoutButton"))
			{
				o.clickOnLogout(driver);
			}
			else if(key.equals("CloseBrowser"))
			{
				o.closeBrowser(driver);
			}
		}
		
	}

}
