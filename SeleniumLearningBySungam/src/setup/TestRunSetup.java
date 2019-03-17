package setup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import data.Constants;

public class TestRunSetup {
	public static WebDriver launch(String browserType, String url) {
		WebDriver driver = null;
		switch (browserType) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
			driver = new ChromeDriver();

			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.FIREFOXDRIVER_PATH);
			driver = new FirefoxDriver();

			break;

		default:
			break;
		}

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		return driver;

	}

}
