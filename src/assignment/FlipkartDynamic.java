package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDynamic {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("//div[@title='Core i7']")).click();
	}

}
