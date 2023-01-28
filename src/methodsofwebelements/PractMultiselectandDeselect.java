package methodsofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PractMultiselectandDeselect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Milind/Desktop/WCSA4/MultiSelectDropdown.html");
		WebElement dropDown = driver.findElement(By.id("menu"));
		Select sel=new Select(dropDown);
		//sel.selectByIndex(0)
		
	}

}
