import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;

public class CallerPhoneTest {
    public static AppiumDriver<MobileElement> driver;

    public static void main(String[] args) {
        try {
            openCalculator();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
    public static void openCalculator() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName","Galaxy J6");
        dc.setCapability("udid","5200bfe3475fc5b7");
        dc.setCapability("platformName","Android");
        dc.setCapability("platformVersion","9");
        dc.setCapability("appPackage","com.samsung.android.dialer");
        dc.setCapability("appActivity","com.samsung.android.dialer.DialtactsActivity");
         URL url = new URL("    http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url,dc);
        System.out.println("Calculator is open...");
    }
}
