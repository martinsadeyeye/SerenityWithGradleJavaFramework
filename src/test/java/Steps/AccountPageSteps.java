package Steps;

import UIPages.AccountPage;
import net.thucydides.core.annotations.Step;

public class AccountPageSteps {


    private AccountPage accountPage;

    @Step
    public void validateAppLogo() {
        accountPage.isLogoExist();
    }


    @Step
    public String searchProduct(String searchKey, String productName) {

        return accountPage.doSearch(searchKey, productName);
    }

}
