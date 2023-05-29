package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TechProAppium1 {
    @Test
    public void test(){
        DesiredCapabilities cap;
        cap = new DesiredCapabilities();

        cap.setCapability("deviceName","Pixel API 29");
        cap.setCapability("platformName","Android");
        cap.setCapability("udid","emulator-5554");
        cap.setCapability("platformVersion","10.0");
        cap.setCapability("App","C:\\Users\\Lenovo\\Apponte1\\src\\apps\\Gesture Tool_1.3_Apkpure.apk");
       // cap.setCapability("appPackage","mobi.appcent.apponte");
       // cap.setCapability("appActivity","mobi.appcent.apponte.ui.activity.login.LoginActivity");
       //cap.setCapability("skipUnloc","true");
        //cap.setCapability("noReset","false");

        try {
            AndroidDriver<MobileElement> driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }
}
