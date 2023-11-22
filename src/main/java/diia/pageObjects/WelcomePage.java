package diia.pageObjects;

import diia.actions.click.ClickHelper;
import diia.actions.wait.WaitHelper;

public class WelcomePage {

    private static final String loginButtonId = "ua.gov.diia.app:id/b_introBaseF_enter";

    public static void clickLoginButton() {
        ClickHelper.makeClickById(loginButtonId);
        WaitHelper.waitForPageLoaded(AuthorizationStepOnePage.getTitleId());
    }
    
}
