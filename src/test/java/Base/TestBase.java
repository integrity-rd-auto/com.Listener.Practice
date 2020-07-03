package Base;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Utility.EventHandler;

public class TestBase {

	public WebDriver driver;
	public EventFiringWebDriver eventDriver;
	public static Logger logger;

	@BeforeClass
	@Parameters("browser")

	public void setup(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C://Driver//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C://Driver//geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else {

			System.out.println("no driver avaialable");
		}
		eventDriver = new EventFiringWebDriver(driver);

		EventHandler handler = new EventHandler();
		eventDriver.register(handler);
		// eventDriver.get("https://toolsqa.com/automation-practice-form");

		eventDriver.get("https://www.freshworks.com/");
		// driver.get("https://www.indiatimes.com/");
		logger = Logger.getLogger("com.Listener.Practice");
		PropertyConfigurator.configure(System.getProperty("user.dir") + "\\test-output\\log4j.properties");
		logger.setLevel(Level.DEBUG);
	}
	
	@AfterTest
	public void terminate() {

		driver.quit();
	}

}
