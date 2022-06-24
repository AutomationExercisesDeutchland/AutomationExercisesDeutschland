package ui.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import ui.pages.AllPages;
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




    @When("Enter an registered email address and password")
    public void enterAnRegisteredEmailAddressAndPassword() {
       allPages.loginPage().loginEmailAddress
               .sendKeys(ConfigurationReader.getProperty("loginEmail"));
       allPages.loginPage().loginPassword
               .sendKeys(ConfigurationReader.getProperty("loginPassword"));

//        allPages.loginPage().loginContinueButton.click();
//        allPages.loginPage().loginNameConfirmationText.isDisplayed();
    }
}
