package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class KitapYurdu {
    @Test
    public void test(){
        DesiredCapabilities cap;
        cap = new DesiredCapabilities();

        cap.setCapability("deviceName","Pixel API 29");
        cap.setCapability("platformName","Android");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("platformVersion","10.0");
        cap.setCapability("appPackage","com.mobisoft.kitapyurdu");
        cap.setCapability("appActivity","com.mobisoft.kitapyurdu.main.SplashActivity");
        cap.setCapability("skipUnloc","true");
        cap.setCapability("noReset","false");

        try {
            AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }
}
