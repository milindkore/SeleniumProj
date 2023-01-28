package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("C:\\Users\\Milind\\Desktop\\WCSA4\\SingleSelectDropdown.html");
	Thread.sleep(3000);
	WebElement dropDownElement = driver.findElement(By.xpath("//select[@id='menu']"));
	Select sel= new Select(dropDownElement);
	Thread.sleep(3000);
	sel.selectByValue("v5");
	
	
	

	}

}
