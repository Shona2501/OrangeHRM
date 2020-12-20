package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//STep1: Store Excel FIle Path
				FileInputStream file= new FileInputStream("C:\\Users\\Sonali\\Desktop\\Automation\\POI.xlsx");
				
				// Step2: Import XSSFWorkbook
				XSSFWorkbook w=new XSSFWorkbook(file);
				
				//Step3: Import XSSFWorsksheet
				XSSFSheet s=w.getSheet("ReadMultipleData");
				
				//Store Row's Size
				int rowSize=s.getLastRowNum();
				System.out.println("No of Rows: "+rowSize);
				
				for(int i=0; i<=rowSize; i++)
				{
					String name = s.getRow(i).getCell(0).getStringCellValue();
					String loc = s.getRow(i).getCell(1).getStringCellValue();
					
					System.out.println(name+"\t\t"+loc);
				}

	}

}
