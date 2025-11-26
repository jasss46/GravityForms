package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseDeviceTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions actions;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        MutableCapabilities capabilities = getDesiredCapabilities();
        String username = "q8656077";
        String accessKey = "LT_RDubLNGbxAEZD5KdnbUPkSiVNQycct4hIAkmqLdcFRxrLUL";
        String GRID_URL = "https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub";

        driver = new RemoteWebDriver(new URL(GRID_URL), capabilities);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(3));
        wait = new WebDriverWait(driver, Duration.ofMinutes(2));
        actions = new Actions(driver);
    }

    private static MutableCapabilities getDesiredCapabilities() {
        // Top-level capability
        MutableCapabilities capabilities = new MutableCapabilities();
        capabilities.setCapability("browserName", "Chrome"); // ✅ browser at top-level
        // LT:Options block (all device + LT-specific settings go here)
        MutableCapabilities ltOptions = new MutableCapabilities();
        ltOptions.setCapability("platformName", "Android");
        ltOptions.setCapability("deviceName", "Pixel 9 Pro");
        ltOptions.setCapability("platformVersion", "14");
        ltOptions.setCapability("build", "Test_Virtual_Device");
        ltOptions.setCapability("name", "TestBlogForm");
        ltOptions.setCapability("project", "Blog Form");
        // Debugging & logging options
        ltOptions.setCapability("console", true);
        ltOptions.setCapability("network", true);
        ltOptions.setCapability("visual", true);
        ltOptions.setCapability("video", true);

        // Attach LT:Options
        capabilities.setCapability("LT:Options", ltOptions);

        return capabilities;
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
