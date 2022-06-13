package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Products {

    public Products(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

       @FindBy (xpath= "(//a[@class='btn btn-default add-to-cart'])[1]")
       WebElement AddToCartIlkUrun;

       @FindBy(xpath="//button[text()='Continue Shopping']")
       WebElement continiueShoppingYazisi;

       @FindBy (xpath="(//a[@class='btn btn-default add-to-cart'])[3]")
       WebElement AddToChartIkinciUrun;

       @FindBy (xpath="//*[text()='View Cart']")
       WebElement viewCart;
}
