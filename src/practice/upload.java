package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class upload {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://html.com/input-type-file/");
		//driver.findElement(By.name("fileupload")).sendKeys("‪C:\\Users\\Milind\\Desktop\\images.jpg");
        driver.findElement(By.xpath("//input[@name='fileupload']")).sendKeys("‪C:\\Users\\Milind\\Desktop\\images.jpg");	
	}

}
