package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Util {

	
	public static String readExcel(int numRow , int numCell) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\Shubham\\eclipse-workspace\\Framework\\Excel\\Excel1.xlsx");
		Sheet x = WorkbookFactory.create(file).getSheet("Sheet3");
		return x.getRow(numRow).getCell(numCell).getStringCellValue();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
