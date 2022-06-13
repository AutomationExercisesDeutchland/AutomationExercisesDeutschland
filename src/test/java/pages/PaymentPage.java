package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PaymentPage{
        public PaymentPage(){
                PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(xpath = "//h2[contains(text(),'Payment')]")
        public WebElement paymentText;
        @FindBy(xpath = "//input[@name='name_on_card']")
        public WebElement paymentNameOnCard;
        @FindBy(xpath = "//input[@name=card_number]")
        public WebElement paymentCardNumber;
        @FindBy(xpath = "//input[@name=cvc]")
        public WebElement paymentCardCvc;
        @FindBy(xpath = "//input[@name='expiry_month']")
        public WebElement paymentCardExpirationMonth;
        @FindBy(xpath = "//input[@name='expiry_year']")
        public WebElement paymentCardExpirationYear;

        @FindBy(xpath = "///button[@id='submit']")
        public WebElement paymentPayAndConfirmOrderButton;

}
