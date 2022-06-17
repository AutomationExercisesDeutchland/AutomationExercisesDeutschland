package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignupPage {


    public SignupPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


     /* =================  New User Signup!  ================= */

    @FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
    public WebElement newUserSignupText;

    @FindBy(css = "input[data-qa='signup-name']")
    public WebElement signUpNameBox;

    @FindBy(css = "input[data-qa='signup-email']")
    public WebElement signUpEmailAddressBox;

    @FindBy(xpath = "//button[contains(text(),'Signup')]")
    public WebElement signUpButton;

    @FindBy(xpath = "//p[(text()='Email Address already exist!')]")
    public WebElement alreadyExistEmailMessage;


    /* ================= ENTER ACCOUNT INFORMATION  ================= */

    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    public WebElement enterAccountInformationText;

    @FindBy(css = "input#id_gender1")
    public WebElement mrRadioButton;

    @FindBy(css = "input#id_gender2")
    public WebElement mrsRadioButton;

    @FindBy(css = "input#name")
    public WebElement infoNameBox;

    @FindBy(css = "input#email")
    public WebElement infoEmailBox;

    @FindBy(css = "input#password")
    public WebElement infoPassword;

    @FindBy(css = "select#days")
    public WebElement daySelectBox;

    @FindBy(css = "select#months")
    public WebElement monthsSelectBox;

    @FindBy(css = "select#years")
    public WebElement yearsSelectBox;

    @FindBy(css = "input#newsletter")
    public WebElement newsletterCheckBox;

    @FindBy(css = "input#optin")
    public WebElement partnersCheckBox;



    /* ================= ADDRESS INFORMATION  ================= */



    @FindBy(css = "input#first_name")
    public WebElement firstNameBox;

    @FindBy(css = "input#last_name")
    public WebElement lastNameBox;

    @FindBy(css = "input#company")
    public WebElement companyBox;

    @FindBy(css = "input#address1")
    public WebElement addressBox;

    @FindBy(css = "input#address2")
    public WebElement address2Box;

    @FindBy(css = "select#country")
    public WebElement countrySelectBox;

    @FindBy(css = "input#state")
    public WebElement stateBox;

    @FindBy(css = "input#city")
    public WebElement cityBox;

    @FindBy(css = "input#zipcode")
    public WebElement zipcodeBox;

    @FindBy(css = "input#mobile_number")
    public WebElement mobileNumberBox;

    @FindBy(css = "button[data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement continueButton;

    @FindBy(xpath = "//*[@id='header']/div/div/div/div[2]/div/ul/li[9]/a/b")
    public WebElement loggedInAsButton;


    /* ================= SUBSCRIPTION   =================  */


    @FindBy(css = "#susbscribe_email")
    public WebElement subscribtionEmailBox;

    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement subscribtionButton;


    /* ================= */













}
