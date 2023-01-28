package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx"); //provide the excel data
		Workbook wb = WorkbookFactory.create(fis);// make the file for read
		Sheet sheet = wb.getSheet("IPL"); //take sheet name
		Row row = sheet.getRow(1);// get value of the row
		Cell cell = row.getCell(0);//get value of cell
		String data = cell.getStringCellValue(); //it will give the value present in cell
		System.out.println(data);
		
	   
		
		
	}
	

}
