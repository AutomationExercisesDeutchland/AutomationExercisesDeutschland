package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Contact_usPage {

    public Contact_usPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(linkText = " Contact us")
    public WebElement ContactUsPageButton;

    @FindBy(xpath = "//h2[(text()='Get In Touch')]")
    public WebElement ContactUsGetInTouch;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement ContactUsNameInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement ContactUsEmailInput;

    @FindBy(xpath = "//input[@name='subject']")
    public WebElement ContactUsSubjectInput;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement ContactUsMessageInput;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement ContactUsChooseFileButton;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement ContactUsSubmitButton;

    @FindBy(className = "status alert alert-success")
    public WebElement ContactUsSuccesMessage;

    @FindBy(xpath = "//span[(text()=' Home')]")
    public WebElement ContactUsHomeButton;

}
