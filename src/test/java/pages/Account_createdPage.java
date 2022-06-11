package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Account_createdPage {

    public Account_createdPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    public WebElement continueButton;
}
