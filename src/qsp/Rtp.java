package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which browser u want to open!!");
		String browserValue = sc.next();
		if (browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/");
			Thread.sleep(2000);
			driver.close();
		}

		else if (browserValue.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/");
			Thread.sleep(20000);
			driver.close();
		} else if (browserValue.equalsIgnoreCase("Edge")) {
			EdgeDriver driver = new EdgeDriver();
			new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/");
			Thread.sleep(3000);
			driver.close();

		} else {
			System.out.println("Enter Valid Browser");

		}

	}
}
