package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file= new FileInputStream("C:\\Users\\Sonali\\Desktop\\Automation\\POI.xlsx");
		XSSFWorkbook w= new XSSFWorkbook(file);
	//XSSFSheet s= w.createSheet("WriteData"); // When first time creating executing a program
	XSSFSheet s= w.getSheet("WriteData"); // After executing the sheet for first time and for edit the sheet we use getSheet method
		
		XSSFRow r1= s.createRow(0);
		r1.createCell(0).setCellValue("Sonali");
		r1.createCell(1).setCellValue("Ingle");
		r1.createCell(2).setCellValue("Chembur");
		
		XSSFRow r2= s.createRow(2);
		r2.createCell(0).setCellValue("Name");
		r2.createCell(1).setCellValue("Location");
		r2.createCell(2).setCellValue("Stream");
		r2.createCell(3).setCellValue("Year");
		r2.createCell(4).setCellValue("marks");
		
		XSSFRow r3= s.createRow(3);
		r3.createCell(0).setCellValue("Anna");
		r3.createCell(1).setCellValue("USA");
		r3.createCell(2).setCellValue("Comps");
		r3.createCell(3).setCellValue("2018");
		r3.createCell(4).setCellValue("89");
	
		FileOutputStream out=new FileOutputStream("C:\\Users\\Sonali\\Desktop\\Automation\\POI.xlsx");
		w.write(out);

	}

}
