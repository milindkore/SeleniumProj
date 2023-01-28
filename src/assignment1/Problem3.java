package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Problem3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
		Thread.sleep(2000);
		
		
		
	}

}
