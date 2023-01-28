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

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		for(int i =1;i<7;i++)
		{
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");// provide the excel sheet file path
			Workbook wb = WorkbookFactory.create(fis);// make the file for Read
			Sheet sheet = wb.getSheet("IPL"); // sheet name
			Row row = sheet.getRow(i);
			Cell cell = row.getCell(0);
			String data = cell.getStringCellValue();
			System.out.println(data);
			
		}
}
}