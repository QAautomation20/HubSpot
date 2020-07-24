package page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBasePage {

	public static WebDriver driver;
	public static Properties prop;

	public TestBasePage() throws IOException {//Created Constructor to initialize properties file
		try {
		 prop = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\nshrestha\\Desktop\\Selenium\\HubSpot\\src\\main\\java\\page\\config.properties");
			prop.load(fi);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void intialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("hs-eu-confirmation-button")).click();
	}

}
