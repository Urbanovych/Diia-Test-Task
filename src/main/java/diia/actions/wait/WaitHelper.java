package diia.actions.wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static diia.BaseTest.getWait;

public class WaitHelper {

    public static WebElement getVisibleElementById(String idLocator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(idLocator)));
    }

    public static List<WebElement> getVisibleElementsById(String idLocator) {
        return getWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(idLocator)));
    }

    public static WebElement getVisibleElementByXpath(String xpathLocator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }

    public static void waitForPageLoaded(String id) {
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }
}
