package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		 EdgeDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://laptop-egfv7cc0/login.do");

	}

}
