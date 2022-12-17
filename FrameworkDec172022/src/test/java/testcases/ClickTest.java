package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.SeleniumUtils;

public class ClickTest {
	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://poi.apache.org/");
		
		SeleniumUtils utils=new SeleniumUtils(driver);
		utils.click("//a[contains(text(),'Component APIs')]");
		
	}
}
