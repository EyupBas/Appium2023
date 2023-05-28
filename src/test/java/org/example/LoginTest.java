package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class LoginTest {


    public AppiumDriver<WebElement> driver;
     public WebDriverWait wait;

     By consultan=By.id("mobi.appcent.apponte:id/btnInstitutional");
    By girisYap=By.id("mobi.appcent.apponte:id/ibSignIn");

    By numberText=By.id("mobi.appcent.apponte:id/etPhoneNumber");

    By sendCodeButton=By.id("mobi.appcent.apponte:id/btnSendCode");



    @BeforeTest
    public void beforeTest(){


        try {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();

            cap.setCapability("deviceName","Pixel API 29");
            cap.setCapability("platformName","Android");
            cap.setCapability("udid","emulator-5554");
            cap.setCapability("platformVersion","10.0");
            cap.setCapability("appPackage","mobi.appcent.apponte");
            cap.setCapability("appActivity","mobi.appcent.apponte.ui.activity.login.LoginActivity");
            cap.setCapability("skipUnloc","true");
            cap.setCapability("noReset","false");

            driver=new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
            //long timeoutInSeconds = 10;
            //driver.manage().timeouts().implicitlyWait(timeoutInSeconds, TimeUnit.SECONDS);
            wait=new WebDriverWait(driver,10);





        }
        catch (MalformedURLException xm){
            System.out.println("hatalı oluşmuş");
        }

    }

    @Test
    public void test(){
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement consultantSlect=driver.findElement(consultan);
        consultantSlect.click();

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement giris=driver.findElement(girisYap);
        giris.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement numberTex=driver.findElement(numberText);
        driver.getKeyboard().pressKey("5536803779");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement sendCodBUtt=driver.findElement(sendCodeButton);
        sendCodBUtt.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);






    }

    @AfterTest
    public void tearDown(){


    }

}
