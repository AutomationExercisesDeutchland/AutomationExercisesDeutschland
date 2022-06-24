package ui.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import ui.pages.AllPages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_6_Contact_Us {

    AllPages allPages=new AllPages();


    @Given("User clicks on contact us page button")
    public void user_clicks_on_contact_us_page_button() {
        Driver.waitAndClick(allPages.contact_usPage().ContactUsPageButton);
    }
    @When("Verify get in touch is visible")
    public void verify_get_in_touch_is_visible() {
        Assert.assertTrue(allPages.contact_usPage().ContactUsGetInTouch.isDisplayed());
    }
    @Then("User enter name,email,subject and message")
    public void user_enter_name_email_subject_and_message() {
        allPages.contact_usPage().ContactUsNameInput.sendKeys(ConfigurationReader.getProperty("name"));
        allPages.contact_usPage().ContactUsEmailInput.sendKeys(ConfigurationReader.getProperty("email"));
        allPages.contact_usPage().ContactUsSubjectInput.sendKeys(ConfigurationReader.getProperty("subject"));
        allPages.contact_usPage().ContactUsMessageInput.sendKeys(ConfigurationReader.getProperty("message"));
    }
    @When("User upload file")
    public void user_upload_file() {
       allPages.contact_usPage().ContactUsChooseFileButton.isSelected();
    }
    @Given("User clicks submit button")
    public void user_clicks_submit_button() {
        Driver.waitAndClick(allPages.contact_usPage().ContactUsSubmitButton);
    }
   // @Given("User clicks ok button")
   // public void user_clicks_ok_button() {

    @Given("Verify success message is visible")
    public void verify_success_message_is_visible() {
        Assert.assertTrue(allPages.contact_usPage().ContactUsSuccesMessage.isDisplayed());
    }
    @Then("User clicks home button and verify to home page successfully")
    public void user_clicks_home_button_and_verify_to_home_page_successfully() {
        Driver.waitAndClick(allPages.contact_usPage().ContactUsHomeButton);
        Assert.assertTrue(allPages.contact_usPage().ContactUsSuccesMessage.isDisplayed());

    }



}
