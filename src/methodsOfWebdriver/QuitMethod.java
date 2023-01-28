package methodsOfWebdriver;

import org.openqa.selenium.edge.EdgeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
	    new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://laptop-egfv7cc0/login.do");
	    Thread.sleep(2000);
	    driver.quit();	

	}

}
