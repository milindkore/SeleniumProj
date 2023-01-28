package datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Flib {
	// to achieve generalization for reading excel data
	
	public String readExcelData(String excelData, String sheetName, int rowCount, int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelData);
		Workbook wb = new WorkbookFactory().create(fis);
	    Sheet sheet = wb.getSheet(sheetName);
	    Row row = sheet.getRow(rowCount);
	    Cell cell = row.getCell(cellCount);
	    String data = cell.getStringCellValue();
	    return data;	
	}
	
	//to get last RowCount
	public int getrowCount(String excelPath, String sheetName) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		 Workbook wb = WorkbookFactory.create(fis);
		 Sheet sheet = wb.getSheet(sheetName);
		 int rc = sheet.getLastRowNum();
		 return rc;
	}

}
