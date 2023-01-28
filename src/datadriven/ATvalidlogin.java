package datadriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ATvalidlogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do");
		
		Flib flib = new Flib();
		String usn = flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 0);
		String pass = flib.readExcelData("./data/ActiTimeTestData.xlsx", "validcreds", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		
	}

}
