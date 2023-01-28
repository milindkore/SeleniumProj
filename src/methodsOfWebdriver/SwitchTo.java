package methodsOfWebdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.jmx.ManagedAttribute;

public class SwitchTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("Java", Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}

}
