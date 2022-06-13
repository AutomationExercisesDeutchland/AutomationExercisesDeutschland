package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Product_details1Page {

    public Product_details1Page(){

         PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath =  "//a[@href='/products']")
    public WebElement ProductsGiris;

    @FindBy (xpath="//img[@id='sale_image']")
    public WebElement ProductsPageVisibleImage;

    @FindBy(xpath=  "//h2[@class='title text-center']")
    public WebElement AllProductsYazisi;

    @FindBy(xpath= "//a[text()='View Product'])[1]")
    public WebElement ilkUrunViewProduct;

    @FindBy(xpath= "//div[@class='product-details']")
    public WebElement ilkUrunProductDetail;

    @FindBy(xpath="//h2[text()='Blue Top']")
    public WebElement ilkUrunProductName;

    @FindBy(xpath="//*[text()='Category: Women > Tops']")
    public WebElement ilkUrunCategory;

    @FindBy(xpath="//span[text()='Rs. 500']")
    public WebElement ilkUrunPrice;

    @FindBy(xpath="//*[text()='Availability:']")
    public WebElement ilkUrunAvailability;

    @FindBy(xpath="//*[text()='Condition:']")
    public WebElement ilkUrunCondition;

    @FindBy(xpath="//*[text()='Brand:']")
    public WebElement ilkUrunBrand;

    @FindBy(xpath="//input[@id='search_product']")
    public WebElement productSearchBox;

    @FindBy(xpath="//*[text()='Searched Products']")
    public WebElement searchedProductsYazisi;






}
