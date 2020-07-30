import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		AndroidDriver<AndroidElement>  driver;
		File f= new File("src");
		File fs= new File(f,"ApiDemos-debug.apk");
		
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(MobileCapabilityType.DEVICE_NAME,"AndriodTest");
		cp.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Uiautomator2");
		cp.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		 driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cp);
		    return driver;
		
}
}