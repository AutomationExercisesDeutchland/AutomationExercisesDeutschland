package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Category_products4 {
    public Category_products4() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Kids - Dress Products')]")
    public WebElement kidsDressProductsText;
}
