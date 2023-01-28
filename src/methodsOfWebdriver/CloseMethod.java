package methodsOfWebdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

@SuppressWarnings("unused")
public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	EdgeDriver driver = new EdgeDriver();
    new EdgeDriver();
    driver.manage().window().maximize();
    driver.get("http://laptop-egfv7cc0/login.do");
    Thread.sleep(2000);
    driver.close();
    
    
    
    
    
    
    
	}

}
