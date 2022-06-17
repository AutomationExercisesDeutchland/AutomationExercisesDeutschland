package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.AllPages;
import utilities.ConfigurationReader;
import utilities.Driver;

public class US_1_Register_User {

    AllPages allPages = new AllPages();
    Faker faker = new Faker();
    String name;
    String email = faker.internet().emailAddress();


    @Given("User go to homepage")
    public void user_go_to_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Given("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Automation Exercise"));

    }

    @Given("Click on Signup - Login button")
    public void click_on_signup_login_button() {

        allPages.account_createdPage().signupLoginButton.click();

    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) throws InterruptedException {

        switch (string) {
            case "New User Signup!":

                Assert.assertEquals(allPages.signupPage().newUserSignupText.getText(), string);
                break;
            case "ENTER ACCOUNT INFORMATION":
                Assert.assertEquals(allPages.signupPage().enterAccountInformationText.getText(), string);
                break;
            case "ACCOUNT CREATED!":
                Assert.assertEquals(allPages.signupPage().accountCreatedText.getText(), string);
                break;
            case "Logged in as username":
                System.out.println("2a. isim : " + name);
                System.out.println("2b. isim : " + allPages.signupPage().loggedInAsButton.getText());
                Thread.sleep(3000);
                Assert.assertEquals(name, allPages.signupPage().loggedInAsButton.getText());
                break;
            case "ACCOUNT DELETED!":
                SoftAssert softAssert = new SoftAssert();
                softAssert.assertTrue(allPages.delete_account().deleteMessage.isDisplayed());
                break;
            case "Login to your account":
             Assert.assertEquals(allPages.loginPage().loginToYourAccountText.getText(),string);
                break;

            default:
                break;
        }

    }

    @When("Enter a name")
    public void enter_a_name() {
        name = faker.name().name();
        System.out.println("1. isim : " + name);
        allPages.signupPage().signUpNameBox.sendKeys(name);

    }

    @When("Enter an email address")
    public void enter_an_email_address() throws InterruptedException {

        Thread.sleep(2000);
        System.out.println("1. email : " + email);
        allPages.signupPage().signUpEmailAddressBox.sendKeys(email);



    }


    @When("User click signup button")
    public void user_click_signup_button() {

        allPages.signupPage().signUpButton.click();

    }

    @Then("User fill: Title, Name, Email, a password {string}, Date of birth")
    public void user_fill_title_name_email_a_password_date_of_birth(String password) {

        allPages.signupPage().mrRadioButton.click();
        allPages.signupPage().infoPassword.sendKeys(password);
        //Thread.sleep(2000);
        allPages.signupPage().daySelectBox.sendKeys("1");
        //Thread.sleep(2000);
        allPages.signupPage().monthsSelectBox.sendKeys("January");
        //Thread.sleep(2000);
        allPages.signupPage().yearsSelectBox.sendKeys("1985");
        //Thread.sleep(5000);
    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void select_checkbox_sign_up_for_our_newsletter() {

        allPages.signupPage().newsletterCheckBox.click();

    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void select_checkbox_receive_special_offers_from_our_partners() {

        allPages.signupPage().partnersCheckBox.click();

    }

    @When("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details() {

        allPages.signupPage().firstNameBox.sendKeys("yavuz");
        allPages.signupPage().lastNameBox.sendKeys("yüce");
        //Thread.sleep(2000);
        allPages.signupPage().companyBox.sendKeys("QA Teams");
        //Thread.sleep(2000);
        allPages.signupPage().addressBox.sendKeys("Cadde 1");
        //Thread.sleep(2000);
        allPages.signupPage().address2Box.sendKeys("Sokak 2");
        //Thread.sleep(1000);
        allPages.signupPage().countrySelectBox.sendKeys("United States");
        //Thread.sleep(1000);
        allPages.signupPage().stateBox.sendKeys("NY");
        //Thread.sleep(1000);
        allPages.signupPage().cityBox.sendKeys("New York");
        //Thread.sleep(1000);
        allPages.signupPage().zipcodeBox.sendKeys("11000");
        //Thread.sleep(1000);
        allPages.signupPage().mobileNumberBox.sendKeys("11000");
        //Thread.sleep(1000);

    }

    @When("Click Create Account button")
    public void click_create_account_button() throws InterruptedException {

        allPages.signupPage().createAccountButton.click();
        Thread.sleep(1000);

    }

    @Then("User click Continue button")
    public void click_continue_button() throws InterruptedException {

        allPages.signupPage().continueButton.click();
        Thread.sleep(1000);

    }

    @When("Click Delete Account button")
    public void click_delete_account_button() {

        //ReusableMethods.waitForClickablility(allPages.delete_account().deleteAccountButton,2000).click();
        allPages.delete_account().deleteAccountButton.click();

    }

    @And("Click login button")
    public void Click_Login_Button() {
        allPages.loginPage().loginButton.click();


    }
}
