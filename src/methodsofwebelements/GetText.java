package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-egfv7cc0/login.jsp");
		WebElement linktext = driver.findElement(By.linkText("License for using this software"));
		 String link = linktext.getText();
		 System.out.println(link);
		driver.close();
		
	}

}
