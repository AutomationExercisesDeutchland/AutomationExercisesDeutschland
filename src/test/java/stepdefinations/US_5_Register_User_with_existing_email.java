package stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AllPages;
import utilities.ConfigurationReader;

public class US_5_Register_User_with_existing_email {

    AllPages allPages = new AllPages();

    @When("Enter a valid name")
    public void enter_a_valid_name() {

        allPages.signupPage().signUpNameBox.sendKeys(ConfigurationReader.getProperty("validUserName"));

    }
    @When("Enter an already registered email address")
    public void enter_an_already_registered_email_address() {

        allPages.signupPage().signUpEmailAddressBox.sendKeys(ConfigurationReader.getProperty("existEmailAddress"));

    }

    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {

        Assert.assertTrue(allPages.signupPage().alreadyExistEmailMessage.isDisplayed());

    }


}
