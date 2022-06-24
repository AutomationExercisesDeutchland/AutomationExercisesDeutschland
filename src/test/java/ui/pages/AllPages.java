package ui.pages;

public class AllPages {
    public AllPages(){}

    private Account_createdPage account_createdPage;
    private Brand_productsHMPage brand_productsHMPage;
    private Brand_productsPoloPage brand_productsPoloPage;
    private Category_products1 category_products1;
    private Category_products2 category_products2;
    private Category_products3 category_products3;
    private Category_products4 category_products4;
    private Category_products6 category_products6;
    private Category_products7 category_products7;
    private Contact_usPage contact_usPage;
    private Delete_account delete_account;
    private HomePage homePage;
    private LoginPage loginPage ;
    private Payment_donePage payment_donePage;
    private PaymentPage paymentPage;
    private Product_details1Page product_details1Page;
    private Products products;
    private ProductSearchPage productSearchPage;
    private SignupPage signupPage;
    private Test_casesPage test_casesPage;
    private View_cartPage view_cartPage;

    public Test_casesPage test_casesPage(){
        if (test_casesPage == null){
            test_casesPage= new Test_casesPage();
        }
        return test_casesPage;
    }

    public View_cartPage view_cartPage(){
        if (view_cartPage == null){
            view_cartPage= new View_cartPage();
        }
        return view_cartPage;
    }

    public ProductSearchPage productSearchPage(){
        if (productSearchPage == null){
            productSearchPage= new ProductSearchPage();
        }
        return productSearchPage;
    }

    public SignupPage signupPage(){
        if (signupPage == null){
            signupPage= new SignupPage();
        }
        return signupPage;
    }

    public Payment_donePage payment_donePage(){
        if (payment_donePage == null){
            payment_donePage= new Payment_donePage();
        }
        return payment_donePage;
    }
    public PaymentPage paymentPage(){
        if (paymentPage == null){
            paymentPage= new PaymentPage();
        }
        return paymentPage;
    }
    public Product_details1Page product_details1Page(){
        if (product_details1Page == null){
            product_details1Page= new Product_details1Page();
        }
        return product_details1Page;
    }
    public Products products(){
        if (products == null){
            products= new Products();
        }
        return products;
    }
    public Delete_account delete_account(){
        if (delete_account == null){
            delete_account= new Delete_account();
        }
        return delete_account;
    }

    public HomePage homePage(){
        if (homePage == null){
            homePage= new HomePage();
        }
        return homePage;
    }

    public LoginPage loginPage(){
        if (loginPage == null){
            loginPage= new LoginPage();
        }
        return loginPage;
    }

    public Contact_usPage contact_usPage(){
        if (contact_usPage == null){
            contact_usPage= new Contact_usPage();
        }
        return contact_usPage;
    }

    public Category_products2 category_products2(){
        if (category_products2 == null){
            category_products2= new Category_products2();
        }
        return category_products2;
    }

    public Category_products3 category_products3(){
        if (category_products3 == null){
            category_products3 = new Category_products3();
        }
        return category_products3;
    }

    public Category_products4 category_products4(){
        if (category_products4 == null){
            category_products4 = new Category_products4();
        }
        return category_products4;
    }

    public Category_products6 category_products6(){
        if (category_products6 == null){
            category_products6 = new Category_products6();
        }
        return category_products6;
    }

    public Category_products7 category_products7(){
        if (category_products7 == null){
            category_products7 = new Category_products7();
        }
        return category_products7;
    }


    public Category_products1 category_products1(){
        if (category_products1 == null){
            category_products1 = new Category_products1();
        }
        return category_products1;
    }

    public Brand_productsPoloPage brand_productsPoloPage(){
        if (brand_productsPoloPage == null){
            brand_productsPoloPage = new Brand_productsPoloPage();
        }
        return brand_productsPoloPage;
    }

    public Brand_productsHMPage brand_productsHMPage(){
        if (brand_productsHMPage == null){
            brand_productsHMPage = new Brand_productsHMPage();
        }
        return brand_productsHMPage;
    }

    public Account_createdPage account_createdPage(){
        if (account_createdPage == null){
            account_createdPage = new Account_createdPage();
        }
        return account_createdPage;
    }
    
}
