package utils;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Utils {
	
	public AppiumDriver driver;
	public HashMap<Integer, String> placesPath = new HashMap<Integer, String>();
	public HashMap<String,String> filterDays = new HashMap<String, String>();
	
	public Utils(AppiumDriver driver) {
		this.driver = driver;
	}

}
