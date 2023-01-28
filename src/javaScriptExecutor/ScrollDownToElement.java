package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownToElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		WebElement rubyelement = driver.findElement(By.xpath("//p[.='Ruby']"));
		Point p = rubyelement.getLocation();
		int xaxis = p.getX();
		int yaxis=p.getY();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		System.out.println(xaxis);
		System.out.println(yaxis);
		
		js.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
		
	}

}
