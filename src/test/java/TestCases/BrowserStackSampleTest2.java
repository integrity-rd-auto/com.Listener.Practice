package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Base.TestBaseBrowserStack;
import Base.TestBaseBrowserStack2;


public class BrowserStackSampleTest2 extends TestBaseBrowserStack2 {

	@Test

	public void simpleTest() {

		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
		driver.quit();
	}
}