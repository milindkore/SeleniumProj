package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".‪C:\\Users\\Milind\\Downloads\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();
		
		// launch the firefox browser
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		

	}

}
