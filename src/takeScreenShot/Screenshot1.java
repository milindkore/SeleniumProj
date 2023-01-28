package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot1 {
	public static void main(String[] args) throws IOException {
		//directly creating obj of browser specific classes 	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.selenium.dev/downloads/");
		 File src = driver.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./ScreenShot/Scren4.jpg");
		 Files.copy(src, dest);
		 
		 
	}

}
