package windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closequit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		Thread.sleep(3000);
		String pHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		System.out.println(pHandle);
		System.out.println("<--------------------------------------------->");
		
		//if(!wh==pHandle)
		//{
			
		//}
		/*for(String wh:allHandles)
		{
			System.out.println(wh);
			driver.switchTo().window(wh).close();
			
		}
		driver.close();
		Thread.sleep(3000);
		//driver.quit();*/
	}

}
