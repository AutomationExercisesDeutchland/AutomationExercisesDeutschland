package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Brand_productsHMPage {
   public Brand_productsHMPage() {
       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy(xpath="/html/body/section[2]/div[1]/div/div[1]/div/h2)")
   public WebElement BrandsItem;

   @FindBy(xpath ="//*[@id=accordian]")
    public WebElement HMItem;

    @FindBy(xpath ="/html/body/section/div/div[2]/div[2]/div[1]/div[5]/div/div[2]/ul/li/a")
    public WebElement ViewProductButtonFirst;


    @FindBy(className="btn btn-default add-to-cart")
    public WebElement AddToCartButtonFirst;


    @FindBy(xpath = "//*[@id=cartModal]/div/div/div[3]/button")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "//*[@id=cartModal]/div/div/div[2]/p[2]/a/u")
    public WebElement viewCartButton;

    @FindBy(xpath = "//*[@id=product-1]/td[6]/a/i")
    public WebElement QuantityButton;

    @FindBy(xpath = "//*[@id=susbscribe_email]")
    public WebElement SubscriptionItem;

    @FindBy(xpath = "//*[@id=subscribe]/i")
    public WebElement Arrow;




}
