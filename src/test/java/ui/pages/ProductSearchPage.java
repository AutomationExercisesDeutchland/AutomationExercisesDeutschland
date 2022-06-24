package ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProductSearchPage {

    public ProductSearchPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath =  "//a[@href='/products']")
    public WebElement ProductsGiris;

    @FindBy(xpath=  "//h2[@class='title text-center']")
    public WebElement AllProductsYazisi;

    @FindBy(xpath="//input[@id='search_product']")
    public WebElement productSearchBox;

    @FindBy(xpath="//*[text()='Searched Products']")
    public WebElement searchedProductsYazisi;


}