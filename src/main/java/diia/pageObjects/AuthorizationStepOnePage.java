package diia.pageObjects;

import diia.actions.click.ClickHelper;
import diia.actions.text.TextHelper;
import diia.actions.wait.WaitHelper;

public class AuthorizationStepOnePage {

    private static final String titleId = "ua.gov.diia.app:id/header_bankSelection";
    private static final String rulesCheckboxId = "ua.gov.diia.app:id/checkbox_loginAgreement";
    private static final String loginButtonId = "ua.gov.diia.app:id/text_button";
    private static final String popUpMessageXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[2]";

    public static void clickRulesCheckbox() {
        ClickHelper.makeClickById(rulesCheckboxId);
    }

    public static void clickLoginButton() {
        ClickHelper.makeClickById(loginButtonId);
    }

    public static String getPopUpText() {
        return TextHelper.getTextByXpath(popUpMessageXpath);
    }

    public static String getTitleId() {
        return titleId;
    }

}
