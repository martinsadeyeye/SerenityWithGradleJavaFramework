package AppTests;

import Steps.AccountPageSteps;
import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.ClearCookiesPolicy;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AccountPageTest {

    @Steps
    LoginPageSteps loginPageSteps;


    @Steps
    AccountPageSteps accountPageSteps;

    @Managed()
    WebDriver browser;


    @Before
    public void setup() {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
    }

    @Test
    public void accountPageLogoTest() {
        accountPageSteps.validateAppLogo();
    }

    @Test
    public void searchTest() {
        String result = accountPageSteps.searchProduct("Dress", "T-shirts > Faded Short Sleeve T-shirts");
        Assert.assertTrue(result.equals("Faded Short Sleeve T-shirts"));

    }

}
