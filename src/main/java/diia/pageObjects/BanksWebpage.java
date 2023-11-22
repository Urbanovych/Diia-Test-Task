package diia.pageObjects;

import diia.actions.click.ClickHelper;

public class BanksWebpage {

    private static final String backFromWebpageButtonId = "ua.gov.diia.app:id/iv_bankIdF_back";

    public static void clickBackButtonInWebPage() {
        ClickHelper.makeClickById(backFromWebpageButtonId);
    }


}
