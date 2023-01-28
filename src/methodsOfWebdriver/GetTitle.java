package methodsOfWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 String titleofWebpage =driver.getTitle();
		 System.out.println(titleofWebpage);
		 Thread.sleep(4000);
		 driver.quit();

	}

}
