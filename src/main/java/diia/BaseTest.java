package diia;

import diia.instanceManagers.AndroidDriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    protected static AndroidDriver driver;
    protected static WebDriverWait wait;

    @BeforeEach
    public void configureAppiumWithAndroidDriver() throws IOException {
        driver = AndroidDriverManager.getInstance();
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    @AfterEach
    public void tearDown() {
        AndroidDriverManager.quit();
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

}
