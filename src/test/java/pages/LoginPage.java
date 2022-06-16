package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//input[@type='email'][1]")
    public WebElement loginEmailAddress;
    @FindBy(xpath = "//input[@type='password'][1]")
    public WebElement loginPassword;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;



    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    public WebElement accountInformationText;
    @FindBy(xpath = "  //label[@for='id_gender1']")
    public WebElement signupMrCheckBox;
    @FindBy(xpath = "  //label[@for='id_gender2']")
    public WebElement signupMrsCheckBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement signupPassword;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement signupDays;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement signupMonths;
    @FindBy(xpath = "//select[@id='years']")
    public WebElement signupYears;
    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement signupNewsletter;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement  specialOffersCheckBox;


    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement  signupFirstName;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement  signupLastName;
    @FindBy(xpath = "//input[@id='company']")
    public WebElement  SignupCompanyName;
    @FindBy(xpath = " //input[@id='address1']")
    public WebElement  signupAddress1;
    @FindBy(xpath = " //input[@id='address2']")
    public WebElement  signupAddress2;
    @FindBy(xpath = "//select[@id='country']")
    public WebElement  signupCountryDropdown;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement  signupState;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement  signupCity;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement  signupZipcode;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement  signupMobileNumber;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement  signupCreateAccountButton;
@FindBy(partialLinkText = "deneme")
    public WebElement denemeYapiyorum;


    @FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement loginContinueButton;

    @FindBy(xpath = "//b[contains(text(),'ali')]")
    public WebElement loginNameConfirmationText;
}
