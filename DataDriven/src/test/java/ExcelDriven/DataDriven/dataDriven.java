package ExcelDriven.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		  
		FileInputStream fis=new FileInputStream("E:\\ignou\\Selenium Data Drive Testing.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++) 
		{
		if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
		XSSFSheet sheet=workbook.getSheetAt(i);
		}	
		}
	}

}
