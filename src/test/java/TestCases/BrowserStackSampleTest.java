package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Base.TestBaseBrowserStack;


public class BrowserStackSampleTest extends TestBaseBrowserStack {

	@Test

	public void simpleTest() {

		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
		driver.quit();
	}
}