package diia.actions.scroll;

import diia.BaseTest;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

import java.time.Duration;

public class ScrollHelper {

    public static TouchAction scrollDown() {
        AndroidDriver driver = BaseTest.getDriver();
        Dimension size = driver.manage().window().getSize();
        int startY = (int) (size.height * 0.8); // 80% від нижньої частини екрану
        int endY = (int) (size.height * 0.2); // 20% від верхньої частини екрану
        int centerX = size.width / 2;

        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(PointOption.point(centerX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(centerX, endY))
                .release();
        return touchAction;
    }

}
