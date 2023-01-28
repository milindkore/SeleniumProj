package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Milind/Desktop/WCSA4/MultiSelectDropdown.html");
		WebElement target = driver.findElement(By.id("menu"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
		Thread.sleep(2000);
		
	}

}
