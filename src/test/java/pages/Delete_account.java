package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Delete_account {

    public Delete_account(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(linkText = " Delete Account")
    public WebElement deleteAccountButton;

}
