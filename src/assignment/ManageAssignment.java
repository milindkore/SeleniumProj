package assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageAssignment {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		   Dimension setSize=new Dimension(250, 350);
		   Thread.sleep(2000);
		   driver.manage().window().setSize(setSize);
		   Thread.sleep(2000);
		   driver.manage().window().maximize();
		 
		 
		 
}
}
