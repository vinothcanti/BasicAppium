package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;

public class BaseClass {
	
	AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup() {
	try {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"");
		dc.setCapability(MobileCapabilityType.UDID,"");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url, dc);
		driver = new AndroidDriver<MobileElement>(url, dc);
		driver = new IOSDriver<MobileElement>(url, dc); 
		driver = new WindowsDriver<MobileElement>(url, dc); 
		
	}catch(Exception exp) {
		System.out.println("cause is"+ exp.getCause());

		System.out.println("message is"+ exp.getMessage());
	}}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}


}
