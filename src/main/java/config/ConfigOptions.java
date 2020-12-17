package config;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class ConfigOptions {
	
	private static final String APPIUM_LOCAL_URL = "http://127.0.0.1:4723/wd/hub";
	private static final String PLATFORM_VERSION = "6.0";
	private static final String DEVICE_NAME = "Nexus 5";
	private static final String APP_PATH = System.getProperty("user.dir")+"/resources/teatre_mallorca.apk";
	private static final String DEVICE_UDID = "192.168.56.101:5555"; // NEXUS 5 GENYMOTION IP
	
	
	public ConfigOptions() {
	}
	
	public String getAppPath() {
		return ConfigOptions.APP_PATH;
	}
	
	public String getLocalUrl() {
		return ConfigOptions.APPIUM_LOCAL_URL;
	}
	
	public String getDeviceUdid() {
		return ConfigOptions.DEVICE_UDID;
	}
	
	public String getVersion() {
		return ConfigOptions.PLATFORM_VERSION;
	}
	
	public String getDeviceName() {
		return ConfigOptions.DEVICE_NAME;
	}
	
	public DesiredCapabilities setCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, getVersion());
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getDeviceName());
		capabilities.setCapability(MobileCapabilityType.APP,getAppPath());
		capabilities.setCapability("noReset", true);
		capabilities.setCapability("udid",getDeviceUdid());
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator1");
		return capabilities;		
	}

}
