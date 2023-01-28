package practicePackageAssign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Assi1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement dest = driver.findElement(By.id("droppable"));
		act.dragAndDrop(src, dest).perform();
		Thread.sleep(2);
		
		
	}

}
