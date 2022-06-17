package stepdefinations;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AllPages;

public class US_3_Login_User_with_incorrect_email_and_password {

    AllPages allPages = new AllPages();
    Faker faker = new Faker();
    String incorrectEmail;
    String incorrectPassword;

    @When("Enter an unregistered email address and password")
    public void enter_an_unregistered_email_address_and_password() throws InterruptedException {

        incorrectEmail= faker.internet().emailAddress();
        System.out.println("Girilen Email : " + incorrectEmail);
        allPages.loginPage().loginEmailAddress.sendKeys(incorrectEmail);

        Thread.sleep(2000);

        incorrectPassword=faker.internet().password();
        System.out.println("Girilen Password : " + incorrectPassword);
        allPages.loginPage().loginPassword.sendKeys(incorrectPassword);


    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {

        Assert.assertTrue(allPages.loginPage().incorrectEmailAndPasswordText.isDisplayed());

    }
}
