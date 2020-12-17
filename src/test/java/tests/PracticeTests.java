package tests;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
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
	
	@Test
	public void test3() throws InterruptedException{
		// Click menu button
		MobileElement el2 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/fab");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/etNewShowTitle");
		el3.click();
		el3.sendKeys("NUEVA OBRA");
		MobileElement el4 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/etNewShowDescription");
		el4.click();
		el4.sendKeys("Test");
		MobileElement el5 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/etNewShowDuration");
		el5.click();
		el5.sendKeys("90");
		MobileElement el6 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/etNewShowPrice");
		el6.click();
		el6.sendKeys("25");
		MobileElement el7 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btNewShowConfirm");
		el7.click();
		MobileElement el8 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/tvDay1");
		el8.click();
		MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("17 December 2020");
		el9.click();
		MobileElement el10 = (MobileElement) driver.findElementById("android:id/button1");
		el10.click();
		MobileElement el11 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/tvDay2");
		el11.click();
		MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("31 December 2020");
		el12.click();
		MobileElement el13 = (MobileElement) driver.findElementById("android:id/button1");
		el13.click();
		MobileElement el14 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbMon");
		el14.click();
		MobileElement el15 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbThu");
		el15.click();
		MobileElement el16 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbSat");
		el16.click();
		MobileElement el17 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/cbSun");
		el17.click();
		MobileElement el18 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btSaveDatesShow");
		el18.click();
		
		MobileElement element3 = (MobileElement) driver.findElementById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/btMainListShows");
		element3.click();
		List<MobileElement> list = (List<MobileElement>) driver.findElementsById("com.example.tonimiquelllullamengual.teatre_idi_nav_bar:id/tv_nom_row");
		boolean exist = false;
		for(int i= 0; i<list.size(); i++) {
			MobileElement me = list.get(i);
			System.out.println(me.getText());
			if(me.getText().equals("NUEVA OBRA")) exist = true;
		}
		assertEquals(exist,true);
		
	}
	
	@After
	public void closeDriver() {
		driver.quit();
	}

}
