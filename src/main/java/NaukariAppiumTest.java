import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class NaukariAppiumTest {
    AndroidDriver<MobileElement> driver;
    @Test
    public void naukariTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy J6");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\HP\\Documents\\Appium\\ApkFile\\naukriApp.appModules.login_2020-08-10.apk");
        URL url = new URL(" http://127.0.0.1:4723/wd/hub");
       driver = new AndroidDriver<MobileElement>(url,capabilities);
    }
}
