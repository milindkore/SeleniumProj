package windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeChildWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String pTitle = driver.getTitle();
		String pHandle = driver.getWindowHandle();
		Set<String> allHandles= driver.getWindowHandles();
		for(String wh:allHandles)
		{
			String currentTitle = driver.switchTo().window(wh).getTitle();
			System.out.println(currentTitle);
			if(!pTitle.equals(currentTitle))
			{
				driver.manage().window().maximize();
			}
		Thread.sleep(3000);
		//driver.quit();
		}
	}

}
