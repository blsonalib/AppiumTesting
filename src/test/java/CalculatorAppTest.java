import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorAppTest {
    AndroidDriver<MobileElement> driver;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilties = new DesiredCapabilities();
        capabilties.setCapability("udid","5200bfe3475fc5b7");
        capabilties.setCapability("platformName","Android");
        capabilties.setCapability("platformVersion","9");
        capabilties.setCapability("deviceName","Galaxy J6");
        capabilties.setCapability("appPackage","com.sec.android.app.popupcalculator");
        capabilties.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver<MobileElement>(url,capabilties);
    }
    @Test
    public void testCalculator() throws InterruptedException {
        MobileElement nine = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_09"));
        nine.click();
        MobileElement multi = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_mul"));
        multi.click();
        MobileElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05"));
        five.click();
        MobileElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
        equal.click();
        Thread.sleep(5000);
        String result = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/txtCalc_RealTimeResult")).getText();
        if (result.equals(45)) {
            System.out.println("Test is passed");
        }
        else {
            System.out.println("Test is failed...");
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
