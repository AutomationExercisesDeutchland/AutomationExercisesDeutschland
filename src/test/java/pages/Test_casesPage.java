package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Test_casesPage {

    public Test_casesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css = "a[href='/test_cases']")
    public WebElement testCasesLink;


    @FindBy(xpath = "//b[contains(text(),'Test Cases')]")
    public WebElement testCasesText;


    @FindBy(xpath = "//span[contains(text(),'Below is the list of test Cases for you to practice')]")
    public WebElement listOfTestCasesText;





}
