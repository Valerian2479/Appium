package com.altpaynet.sobre.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

// import org.openqa.selenium.By;
// import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
// import org.testng.annotations.BeforeClass;
// import org.testng.annotations.BeforeMethod;
// import org.testng.annotations.BeforeTest;
// import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

// import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
// import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

    public static AndroidDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {

        File f = new File("src");
        File fs = new File(f, "app-debug.apk");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "12.0");
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("app", fs.getAbsolutePath());
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appWaitActivity", "com.nationlink.mobileapps.sobre.ui.accept_terms.AcceptTermsActivity");
        URL url = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver(url, caps);

    }

    // @Test
    // public void tryTest() {
    // System.out.println("success");
    // }

    @AfterTest
    public void teardown() {
        // driver.close();
        driver.quit();
    }
}
