package bigAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A4ebay {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple watch");
		WebElement dropdownelement = driver.findElement(By.xpath("//select[@name='_sacat']"));
		Select sel=new Select(dropdownelement);
		sel.selectByIndex(21);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
