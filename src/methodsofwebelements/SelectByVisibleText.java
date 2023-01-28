package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Milind/Desktop/WCSA4/SingleSelectDropdown.html");
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		Select sel=new Select(dropDownElement);
		boolean status = sel.isMultiple();
		System.out.println(status);
		
	}

}
