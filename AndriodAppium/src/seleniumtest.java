import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumtest {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Selenium-drivers\\geckodriver-v0.20.1-win64\\geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

	}

}
