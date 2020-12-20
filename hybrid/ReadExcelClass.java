package hybrid;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import keyword_Driven.OperationalClass;

public class ReadExcelClass {
	
	public void readExcel (WebDriver driver) throws Exception
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Sonali\\Desktop\\Automation\\POI.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(file);
		XSSFSheet s= w.getSheet("Hybrid");
		
		int rowSize=s.getLastRowNum();
		System.out.println("No of Keywords: "+rowSize);
		
		OperationalClass o= new OperationalClass();
		
		for(int i=1; i<=rowSize; i++) // Data Driven Testing
		{
			
			//Username & password
			String username =s.getRow(i).getCell(1).getStringCellValue();
			String password=s.getRow(i).getCell(2).getStringCellValue();
			System.out.println(username+ "\t\t" +password);
			
			try
			{
				for(int j=1; j<=rowSize; j++) // Keyword Driven testing
				{
					
					//Keywords
					String key=s.getRow(j).getCell(0).getStringCellValue();
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
						o.enterUsername(driver, username);
					}
					else if(key.equals("EnterPassword"))
					{
						o.enterPassword(driver, password);
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
						
						System.out.println("Valid username & password");
						s.getRow(i).createCell(3).setCellValue("Valid username & password");
						System.out.println("");
					}		
					
				}
			}
			catch(Exception e)
			{
				System.out.println("Invalid username & password");
				s.getRow(i).createCell(3).setCellValue("Invalid username & password");
				System.out.println("");
			}
		}
		
		FileOutputStream out = new FileOutputStream("C:\\Users\\Sonali\\Desktop\\Automation\\POI.xlsx");
		w.write(out);
	}
	

}
