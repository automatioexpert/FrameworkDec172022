package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumUtils {

	private WebDriver driver;

	public SeleniumUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void click(String locator) {
		if (locator.endsWith("xpath")) {
			driver.findElement(By.xpath(locator)).click();
		} else if (locator.endsWith("css")) {
			driver.findElement(By.cssSelector(locator)).click();
		} else if (locator.endsWith("id")) {
			driver.findElement(By.id(locator)).click();
		} else if (locator.endsWith("name")) {
			driver.findElement(By.name(locator)).click();
		} else if (locator.endsWith("linkText")) {
			driver.findElement(By.linkText(locator)).click();
		}

	}

	
}
