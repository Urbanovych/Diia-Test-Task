package android;

import diia.BaseTest;
import diia.pageObjects.AuthorizationStepOnePage;
import diia.pageObjects.AuthorizationStepTwoPage;
import diia.pageObjects.BanksWebpage;
import diia.pageObjects.WelcomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class PortraitBankIdTest extends BaseTest {

    // У цьому файлі є тести з:
    // 1) відсутності зв'язку,
    // 2) переходу застосунку в фоновий режим та повернення з нього,
    // 3) блокування та розблокування екрану пристрою.

    @Test
    public void testWithoutInternetConnectionDuringAuthorization() {
        // Off Wi-Fi and mobile data for test
        driver.toggleWifi();
        driver.toggleData();

        WelcomePage.clickLoginButton();

        AuthorizationStepOnePage.clickRulesCheckbox();
        AuthorizationStepOnePage.clickLoginButton();

        Assertions.assertEquals(
                "Немає інтернету. Перевірте з’єднання та спробуйте ще раз",
                AuthorizationStepOnePage.getPopUpText(),
                "Messages are not same");
    }

    @Test
    public void testWithGoToBackgroundDuringAuthorization() {
        WelcomePage.clickLoginButton();

        AuthorizationStepOnePage.clickRulesCheckbox();
        AuthorizationStepOnePage.clickLoginButton();

        // Put app in background for 5 seconds
        driver.runAppInBackground(Duration.ofSeconds(5));

        AuthorizationStepTwoPage.scrollDownBankLayout();
        AuthorizationStepTwoPage.clickGrantBankButton();

        BanksWebpage.clickBackButtonInWebPage();

        Assertions.assertEquals(
                "Оберіть свій банк",
                AuthorizationStepTwoPage.getTitle(),
                "Title is not expected");
    }

    @Test
    public void testWithLockAndUnlockDeviceDuringAuthorization() {
        WelcomePage.clickLoginButton();

        AuthorizationStepOnePage.clickRulesCheckbox();
        AuthorizationStepOnePage.clickLoginButton();

        // lock device for 5 seconds
        driver.lockDevice(Duration.ofSeconds(5));
        driver.unlockDevice();

        AuthorizationStepTwoPage.scrollDownBankLayout();
        AuthorizationStepTwoPage.clickSportBankButton();

        BanksWebpage.clickBackButtonInWebPage();

        Assertions.assertEquals(
                "Оберіть свій банк",
                AuthorizationStepTwoPage.getTitle(),
                "Title is not expected");
    }

}
