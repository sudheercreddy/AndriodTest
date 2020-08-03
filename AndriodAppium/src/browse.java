import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class browse extends BaseCode{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver= capabilities();
		driver.get("http://google.com");
		Thread.sleep(5000);
		//
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Hello Appium Script");
		

	}

}