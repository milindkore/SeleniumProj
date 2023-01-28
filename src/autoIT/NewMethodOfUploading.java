package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewMethodOfUploading {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class, 'content administration')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		driver.findElement(By.name("formCustomInterfaceLogo.logo")).sendKeys("‪C:\\Users\\Milind\\Desktop\\images.jpg");
	}

}
