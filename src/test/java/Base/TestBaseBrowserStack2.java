package Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Utility.EventHandler;

public class TestBaseBrowserStack2 {

	public static WebDriver driver;
	public static Logger logger;
	public static final String USERNAME = "subhenduchakrabo1";
	public static final String AUTOMATE_KEY = "PYzkcsqsj7zzfwyhWCoM";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws MalformedURLException {

		if (browser.equalsIgnoreCase("chrome")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "8");
			caps.setCapability("browser", "Chrome");
			caps.setCapability("browser_version", "80");

			caps.setCapability("name", "subhenduchakrabo1's First Test");

			driver = new RemoteWebDriver(new URL(URL), caps);
			// driver.get("http://www.google.com");
		} else if (browser.equalsIgnoreCase("firefox")) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os", "Windows");
			caps.setCapability("os_version", "8");
			caps.setCapability("browser", "Firefox");
			caps.setCapability("browser_version", "78");
			caps.setCapability("name", "subhenduchakrabo1's First Test");

			driver = new RemoteWebDriver(new URL(URL), caps);
			// driver.get("http://www.google.com");

		}

	}

	public static void initialize() {
		driver.get("http://www.google.com");
		logger = Logger.getLogger("PTCIntegrity");
		PropertyConfigurator.configure(System.getProperty("user.dir") + "\\test-output\\log4j.properties");
		logger.setLevel(Level.DEBUG);

	}

	@AfterTest
	public void terminate() {

		driver.quit();
	}

}
