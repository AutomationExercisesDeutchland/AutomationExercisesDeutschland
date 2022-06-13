package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Brand_productsPoloPage {

    public Brand_productsPoloPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath="/html/body/section[2]/div[1]/div/div[1]/div/h2)")
    public WebElement BrandsItem;

    @FindBy(xpath="/html/body/section/div/div[2]/div[1]/div[1]/div[3]/div/ul/li[1]/a")
    public WebElement PoloItem;

    @FindBy(partialLinkText ="product_details/1")
    public WebElement ViewProductItemFirst;

    @FindBy(className ="btn btn-default add-to-cart")
    public WebElement AddToCarItemFirst;

    @FindBy(className ="text-center")
    public WebElement ViewCartItemFirst;

    @FindBy(className = "fa fa-times")
    public WebElement quantityButton;

    @FindBy(className = "btn btn-success chose-modal btn-block")
    public WebElement continueShoppingButton;




}
