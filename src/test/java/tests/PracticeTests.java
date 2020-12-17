package tests;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import config.ConfigOptions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import utils.Utils;

public class PracticeTests {
	
	AppiumDriver driver;
	Utils utils;
	ConfigOptions options = new ConfigOptions();
	
	//Data
	
	// Activity elements Test 1
	public String menuButtonPath = "Open navigation drawer";
	
	//Activity elements Test 2
	
	//Activity elements Test 3
	
	//Activity elements Test 4
	
	//Activity elements Test 5
	
	//Activity elements Test 6
	
	@Before
	public void openTest() throws InterruptedException {

		DesiredCapabilities capabilities = options.setCapabilities();
		
		try {
			// Instatiate Android Driver
			driver = new AndroidDriver(new URL(options.getLocalUrl()), capabilities);
			// Add implicit wait (20 seconds)
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			utils = new Utils(driver);
		} catch (MalformedURLException e) {
			System.out.println(options.getLocalUrl() + " IS NOT A VALID URL");
		}
	}
	
	@Test
	public void test1() {
		// Click menu button
		MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Open navigation drawer");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.CheckedTextView");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btMainListShows");
		el3.click();
		List<MobileElement> list = (List<MobileElement>) driver.findElementsById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/tv_nom_row");
		assertEquals(3, list.size());
	}
	
	@Test
	public void test2() {
		// Click menu button
		MobileElement el1 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btMainListShows");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("android:id/button1");
		el4.click();
		MobileElement title = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/tvInfoTitle");
		assertEquals("EL REY LEON", title.getText());
	}
	
	@After
	public void closeDriver() {
		driver.quit();
	}

}
