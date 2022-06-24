package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class View_cartPage {

    public View_cartPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[href='/view_cart']")
    public WebElement viewCartLink;

    @FindBy(css = "//a [contains(text(),'Proceed To Checkout')]")
    public WebElement proceedToCheckoutButton;


    @FindBy(css = "#susbscribe_email")
    public WebElement subscribtionEmailBox;


    @FindBy(xpath = "//button[@id='subscribe']")
    public WebElement subscribtionButton;

    @FindBy(xpath = "//div[contains(text(),'You have been successfully subscribed!')]")
    public WebElement alertVerifyText;







}
