package LIbraryFiles;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.reporters.jq.Main;

public class BasePage {

	public WebDriver driver;

	@BeforeSuite
	public void InitializeBrowser() throws IOException {

		System.setProperty("webdriver.chrome.driver", Utility_Class.gettestdata("chromepath"));

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(Utility_Class1.GetTestData("url"));

	}
}
