package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Delete_account {

    public Delete_account(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[(text()=' Delete Account')]")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//body[contains(text),'ACCOUNT DELETED!']")
    public WebElement deleteMessage;

}
