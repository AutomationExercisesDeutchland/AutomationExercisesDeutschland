package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement loginEmailAddress;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement loginPassword;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[(text()='Login to your account')]")
    public WebElement loginToYourAccountText;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement loginContinueButton;

    @FindBy(xpath = "//b[contains(text(),'ali')]")
    public WebElement loginNameConfirmationText;

    @FindBy(xpath="//p[contains(text(),'Your email or password is incorrect!')]")
    public WebElement incorrectEmailAndPasswordText;
}
