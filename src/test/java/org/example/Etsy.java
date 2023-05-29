package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Etsy {
    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait;

    String searchProduct="wooden spoon cutlery";



    @BeforeTest
    public void beforeTest(){


        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();

            cap.setCapability("deviceName","Pixel API 29");
            cap.setCapability("platformName","Android");
            cap.setCapability("udid","emulator-5554");
            cap.setCapability("platformVersion","10.0");
            cap.setCapability("appPackage","com.etsy.android");
            cap.setCapability("appActivity","com.etsy.android.ui.homescreen.HomescreenTabsActivity");
            cap.setCapability("skipUnloc","true");
            cap.setCapability("noReset","false");

            driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            wait=new WebDriverWait(driver,10);





        }
        catch (MalformedURLException xm){
            System.out.println("hatalı oluşmuş");
        }

    }

    @Test
    public void test() throws InterruptedException {

        //GOOGLE BUTTON TIKLA
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.findElement(By.id("com.google.android.gms:id/continue_button")).click();
        Thread.sleep(4000);











    }

    @AfterTest
    public void tearDown(){


    }







}
