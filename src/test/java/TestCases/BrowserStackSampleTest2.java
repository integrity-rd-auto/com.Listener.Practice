package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base.TestBaseBrowserStack2;
import Page.HomePage;

public class BrowserStackSampleTest2 extends TestBaseBrowserStack2 {

	HomePage homepage;
	
	@BeforeClass
	
	public void setUp() {
		
		TestBaseBrowserStack2.initialize();
			
		homepage = new HomePage(driver);
	}

	@Test

	public void simpleTest() {
		
		logger.info("test002 starts Here");

		Assert.assertEquals(homepage.search(), "BrowserStack - Google Search");

	}
}