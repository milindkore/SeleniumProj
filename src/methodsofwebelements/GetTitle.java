package methodsofwebelements;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("http://laptop-egfv7cc0/login.do");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        String TitleOfWebPage= driver.getTitle();
	        System.out.println(TitleOfWebPage);
	        driver.close();
	        
	        
	       

	}

}
