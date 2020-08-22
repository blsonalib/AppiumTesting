import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.net.MalformedURLException;
import java.net.URL;

public class DialerAppiumTesting {
    AndroidDriver<MobileElement> driver;
    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid","5200bfe3475fc5b7");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("deviceName","Galaxy J6");
        capabilities.setCapability("appPackage","com.samsung.android.dialer");
        capabilities.setCapability("appActivity","com.samsung.android.dialer.DialtactsActivity");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url,capabilities);
    }

    @AfterMethod
    public void tearDown() {
       driver.quit();
    }
}
