package methodsOfWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 String SourceCode =driver.getPageSource();
		 Thread.sleep(2000);
		 System.out.println(SourceCode);

	}

}
