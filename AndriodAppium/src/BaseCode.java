import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseCode {
public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
{
AndroidDriver<AndroidElement>  driver;

// TODO Auto-generated method stub
File appDir = new File("src");
     File app = new File(appDir, "General-Store.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
     //Emulator
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndriodTest");
    
     //android Device
    // capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
     
     //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
     
     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Uiautomator2");
     
     //capabilities.setCapability("chromedriverExecutable","C:\\Selenium-drivers\\chromedriver\\chromedriver.exe");
    
   capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
   
    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   return driver;
}

}

