package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.TestBase;
import Utility.EventHandler;

public class TestCase001 extends TestBase {

	@Test

	public void test001() {
		
		logger.info("test001 starts Here");

		System.out.println(eventDriver.getTitle());
		
		logger.info("test001 ends Here");
	}
	@Test

	public void test002() {
		
		logger.info("test002 starts Here");

		//List<WebElement> list = eventDriver.findElements(By.cssSelector("ul.footer-nav li a"));
		
		List<WebElement> list = eventDriver.findElements(By.xpath("//ul[@class='footer-nav']/li/a"));
		
		Assert.assertEquals(list.size(), 30);
		
		logger.info("test002 ends Here");
	}


}
