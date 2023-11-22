package android;

import diia.BaseTest;
import diia.pageObjects.AuthorizationStepOnePage;
import diia.pageObjects.AuthorizationStepTwoPage;
import diia.pageObjects.BanksWebpage;
import diia.pageObjects.WelcomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Before run this test rotate emulated device to landscape mode.
public class LandscapeBankIdTest extends BaseTest {

    // У цьому файлі є тести з:
    // 1) пристроєм у альбомному режимі.

    @Test
    public void testLandscapeOrientationDuringAuthorization() {
        WelcomePage.clickLoginButton();

        AuthorizationStepOnePage.clickRulesCheckbox();
        AuthorizationStepOnePage.clickLoginButton();

        AuthorizationStepTwoPage.scrollDownBankLayout();
        AuthorizationStepTwoPage.clickIziBankButton();

        BanksWebpage.clickBackButtonInWebPage();

        Assertions.assertEquals(
                "Оберіть свій банк",
                AuthorizationStepTwoPage.getTitle(),
                "Title is not expected");
    }
}
