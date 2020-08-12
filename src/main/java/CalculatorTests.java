 import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTests{
    private static AndroidDriver<MobileElement> driver;
    public static void main(String[] args) {
        try {
            calculator();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public static void calculator() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy J6");
        capabilities.setCapability("udid","5200bfe3475fc5b7");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.sec.android.app.popupcalculator");
        capabilities.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
        URL url = new URL(" http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url,capabilities);
        MobileElement eight = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08"));
        MobileElement minus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_sub"));
        MobileElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_05"));
        MobileElement equals = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_equal"));
        MobileElement resThree = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_03"));
     //   driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.sec.android.app.popupcalculator:id/bt_09']"));
        eight.click();
        minus.click();
        five.click();
        equals.click();
        String result = resThree.getText();
        System.out.println("The Result is:"+result);
        System.out.println("Completed.....");

    }
}
