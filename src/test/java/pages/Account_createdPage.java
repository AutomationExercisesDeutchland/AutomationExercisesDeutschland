package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Account_createdPage {

    public Account_createdPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@linkText=login]")
    public WebElement signUpTab;

    @FindBy(name = "name")
    public WebElement nameTextBox;

    @FindBy(name = "email")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@class=signup]")
    public WebElement signUpButton;

    @FindBy(id = "id_gender2")
    public WebElement titleTab;

    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "days")
    public WebElement dayBox;

    @FindBy(id = "months")
    public WebElement monthBox;

    @FindBy(id = "years")
    public WebElement yearsBox;

    @FindBy(id = "newsletter")
    public WebElement newsletterTab;

    @FindBy(id = "optin")
    public WebElement partnerBox;

    @FindBy(id = "first_name")
    public WebElement firstNameTextBox;

    @FindBy(id = "last_name")
    public WebElement lastNameTextBox;

    @FindBy(id = "address1")
    public WebElement addressTextBox;

    @FindBy(id = "country")
    public WebElement countryTextBox;

    @FindBy(id = "state")
    public WebElement stateTextBox;

    @FindBy(id = "city")
    public WebElement cityTextBox;

    @FindBy(id = "zipcode")
    public WebElement zipcodeTextBox;

    @FindBy(id = "mobil_number")
    public WebElement mobilNumberTextBox;

    @FindBy(xpath = "//*[@class=Create Account]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[@href=/delete_account")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//*[@href=/logout")
    public WebElement logoutButton;

    @FindBy(xpath = "//h2[(text()='New User Signup!')]")
    public WebElement newUserSignupText;

    @FindBy(xpath = "//a[(text()=' Signup / Login')]")
    public WebElement signupLoginButton;


}