package locator;
// xpath by using text
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		//driver.findElement(By.xpath(''))
		
		
	}

}
