package diia.pageObjects;

import diia.BaseTest;
import diia.actions.click.ClickHelper;
import diia.actions.scroll.ScrollHelper;
import diia.actions.text.TextHelper;
import diia.actions.wait.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AuthorizationStepTwoPage {

    private static final String privatBankButtonXpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView";
    private static final String grantBankButtonsXpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.TextView";
    private static final String iziBankButtonXpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.widget.TextView";
    private static final String sportBankButtonXpath = "//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[20]/android.widget.TextView";
    private static final String titleXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[2]";

    public static void clickGrantBankButton() {
        ClickHelper.makeClickByXpath(grantBankButtonsXpath);
    }

    public static void clickIziBankButton() {
        ClickHelper.makeClickByXpath(iziBankButtonXpath);
    }

    public static void clickSportBankButton() {
        ClickHelper.makeClickByXpath(sportBankButtonXpath);
    }

    public static String getTitle() {
        return TextHelper.getTextByXpath(titleXpath);
    }

    public static void scrollDownBankLayout() {
        WaitHelper.getVisibleElementByXpath(privatBankButtonXpath);
        ScrollHelper.scrollDown().perform();
    }

}
