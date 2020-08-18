import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class IndeedTestingUsingApkFile {
    AppiumDriver<WebElement> driver;
    @Test
    public void  appiumTest() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("deviceName","Galaxy J6");
        dc.setCapability("platformName","Android");
        dc.setCapability("platformVersion","9");
        String path = "C:\\Users\\HP\\Documents\\Appium\\ApkFile\\Indeed Job Search_v29.0_apkpure.com.apk";
        File file = new File(path);
       dc.setCapability("app",file.getAbsoluteFile());

            URL url = new URL("    http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<WebElement>(url,dc);
    }
}
