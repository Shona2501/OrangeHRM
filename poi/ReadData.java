package poi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws Exception {
		
		//STep1: Store Excel FIle Path
		FileInputStream file= new FileInputStream("C:\\Users\\Sonali\\Desktop\\Automation\\POI.xlsx");
		
		// Step2: Import XSSFWorkbook
		XSSFWorkbook w=new XSSFWorkbook(file);
		
		//Step3: Import XSSFWorsksheet
		XSSFSheet s=w.getSheet("ReadData");
		
		//Step4: Read Data
		String a=s.getRow(0).getCell(0).getStringCellValue();
		String b=s.getRow(0).getCell(1).getStringCellValue();
		int c=(int) s.getRow(0).getCell(2).getNumericCellValue();
		
		//Step 5: Display data
		System.out.println(a+"\t\t" +b+"\t\t"+c);	
	}

}
