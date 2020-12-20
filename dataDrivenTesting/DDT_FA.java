package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_PageObjectModel.FA_POM;

public class DDT_FA {

	public static void main(String[] args) throws Exception {

		// Excel path
				FileInputStream file= new FileInputStream("C:\\Users\\Sonali\\Desktop\\Automation\\POI.xlsx");
				
				//Create XSSF Workbook
				XSSFWorkbook w= new XSSFWorkbook(file);
				//Create XSSFSheet
				XSSFSheet s= w.getSheet("DataDrivenFA");
				
				//Store Last row Number
				int rowSize = s.getLastRowNum();
				System.out.println("No of Username and Password:" +rowSize); // Display row count on the table
				
				//Launch Browser + Import WebDriver class with ChromeDriver constructor
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sonali\\Desktop\\Automation\\BrowserExtenssion\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				// Create object = fa POM class
				FA_POM f= new FA_POM();
				
				//For loop
				for(int i=1; i<=rowSize; i++)
				{
					//DDT--> Storing username and password in form of variable
					String username= s.getRow(i).getCell(0).getStringCellValue();
					String password= s.getRow(i).getCell(1).getStringCellValue();
					
					System.out.println(username+ "\t\t" +password); // displayed username and password on console
					
					//To handle run time errors / Exception
					try
					{
						
					// To handle  use login script which is store in OrangeHRM_POM class	
					f.maximize(driver);
					Thread.sleep(2000);
					f.url(driver);
					Thread.sleep(2000);
					f.enterUsername(driver, username);
					f.enterPassword(driver, password);
					//f.selectCompany(driver);
					Thread.sleep(2000);
					f.clickOnLogin(driver);
					Thread.sleep(2000);
					f.clickOnLogout(driver);
					
					//Display Result----> Positive data
					System.out.println("valid username & password");
					s.getRow(i).createCell(2).setCellValue("valid username & password");
					System.out.println("");
					}
					
					
					catch(Exception e)
					{
						
						//Display Result----> Negative data
						System.out.println("Invalid Username and Password");
						s.getRow(i).createCell(2).setCellValue("Invalid Username and Password");
						System.out.println("");
					}
				}
				// To write on ExcelSheet
				FileOutputStream out= new FileOutputStream("C:\\Users\\Sonali\\Desktop\\Automation\\POI.xlsx");
				w.write(out);

			}


	}


