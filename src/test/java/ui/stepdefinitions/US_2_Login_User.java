package ui.stepdefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import ui.pages.AllPages;
import utilities.Driver;

public class US_2_Login_User {
    AllPages allPages = new AllPages();
    @When("User Clicks login button")
    public void user_clicks_login_button() {
        Driver.waitAndClick(allPages.loginPage().loginButton);

    }

    @Then("Verify that Logged in as username is visible as {string}")
    public void verify_that_is_visible_as_ali(String userName) {
        Assert.assertEquals(userName,allPages.loginPage().loginNameConfirmationText.getText());
    }


}
