package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base.TestBaseBrowserStack3;
import Page.HomePage;

public class BrowserStackSampleTest3 extends TestBaseBrowserStack3 {

	HomePage homepage;

	@BeforeClass

	public void setUp() {

		TestBaseBrowserStack3.initialize();

		homepage = new HomePage(driver);
	}

	@Test

	public void simpleTest() {

		logger.info("test003 starts Here");
		Assert.assertEquals(homepage.search(), "BrowserStack - Google Search");

	}
}