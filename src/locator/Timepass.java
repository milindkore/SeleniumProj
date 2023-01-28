package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timepass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://laptop-egfv7cc0/login.do");
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(4000);
		 driver.close();

}
}
