package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class payment_donePage {
    public payment_donePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//b[contains(text(),'Order Placed!')]")
    public WebElement paymentDoneOrderPlaced;
    @FindBy(xpath = " //p[contains(text(),'Congratulations! Your order has been confirmed!')]")
    public WebElement paymentDoneCongratulationsText;
    @FindBy(xpath = " //a[contains(text(),'Download Invoice')]")
    public WebElement paymentDoneDownloadInvoiceButton;
    @FindBy(xpath = " //a[contains(text(),'Continue')]")
    public WebElement paymentDoneContinueButton;



    ;

}
