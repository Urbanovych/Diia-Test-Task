package diia.instanceManagers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import static diia.properties.PropertiesHelper.getPropertiesFromPath;

public class AndroidDriverManager {

    private static ThreadLocal<AndroidDriver> driver = new ThreadLocal<>();

    public static AndroidDriver getInstance() throws IOException {
        if (driver.get() == null) {
            Properties androidDriverProperties = getPropertiesFromPath("src/main/resources/android/androidDriver.properties");
            File app = new File(androidDriverProperties.getProperty("appPath"));
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName(androidDriverProperties.getProperty("deviceName"));
            options.setApp(app.getAbsolutePath());
            options.setAutomationName(androidDriverProperties.getProperty("automationName"));

            driver.set(new AndroidDriver(new URL("http://0.0.0.0:4723"), options));
        }
        return driver.get();
    }

    public static void quit() {
        driver.get().quit();
        driver.remove();
    }
}
