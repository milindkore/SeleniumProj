package takeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//h1[@class='display-1 mt-0 mt-md-5 pb-1']"));
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/Screenshot3.jpg");
		Files.copy(src, dest);
		
		
		
		
		
	}

}
