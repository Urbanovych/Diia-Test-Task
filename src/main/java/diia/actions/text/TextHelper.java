package diia.actions.text;

import diia.actions.wait.WaitHelper;

public class TextHelper {

    public static String getTextById(String idLocator) {
        return WaitHelper.getVisibleElementById(idLocator).getText();
    }

    public static String getTextByXpath(String xpathLocator) {
        return WaitHelper.getVisibleElementByXpath(xpathLocator).getText();
    }
}
