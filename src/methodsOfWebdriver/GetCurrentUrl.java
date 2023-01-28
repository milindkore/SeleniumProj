package methodsOfWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 String CurrentUrl =driver.getCurrentUrl();
		 Thread.sleep(2000);
		 driver.close();
		 System.out.println(CurrentUrl);

	}

}
