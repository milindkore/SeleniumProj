package methodsOfWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.google.com/");
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 driver.close();
		 
	}

}
