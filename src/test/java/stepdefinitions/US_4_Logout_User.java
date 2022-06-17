package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AllPages;

public class US_4_Logout_User {

    AllPages allPages = new AllPages();

    @Then("Click Logout button")
    public void click_logout_button() {
        allPages.account_createdPage().logoutButton.click();
    }

    @Then("Verify that user is navigated to login page")
    public void verify_that_user_is_navigated_to_login_page() {
        Assert.assertEquals(allPages.loginPage().loginToYourAccountText.getText(),"Login to your account");

    }
}
