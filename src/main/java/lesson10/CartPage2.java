package lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage2 {
    private static final String PAGE_URL = "http://automationpractice.com";
    private WebDriver driver;

    @FindBy(id = "search_query_top")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id='searchbox']/button")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id='list']/a")
    private WebElement listIcon;

    @FindBy(className = "ajax_add_to_cart_button")
    private WebElement addToCartButton;

    @FindBy(css = "a[class='btn btn-default button button-medium']")
    private WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//*[@id='cart_quantity_up_2_7_0_0']")
    private WebElement addQty;

    @FindBy(xpath = "//*[@id='total_product_price_2_7_0']")
    private WebElement totalForProduct;

    @FindBy(xpath = "//*[@id='total_product']")
    private WebElement totalProducts;

    @FindBy(xpath = "//*[@id='total_shipping']")
    private WebElement totalShipping;

    @FindBy(xpath = "//*[@id='total_price_without_tax']")
    private WebElement total;

    @FindBy(xpath = "//*[@id='total_tax']")
    private WebElement tax;

    @FindBy(xpath = "//*[@id='total_price']")
    private WebElement totalAmount;

    @FindBy(xpath = "//*[@id='2_7_0_0']")
    private WebElement trashIcon;

    @FindBy(xpath = "//*[@id='center_column']/p")
    private WebElement emptyCartNotification;


    public CartPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CartPage2 openPage() {
        this.driver.navigate().to(PAGE_URL);
        return this;
    }

    public CartPage2 searchBlouse() {
        searchField.sendKeys("Blouse");
        searchButton.click();
        return this;
    }

    public CartPage2 turnIntoListView() {
        listIcon.click();
        return this;
    }

    public CartPage2 addProductIntoCart() {
        addToCartButton.click();
        return this;
    }

    public CartPage2 proceedToCheckout() {
        proceedToCheckoutButton.click();
        return this;
    }

    public CartPage2 addQtyOfProducts() {
        addQty.click();
        return this;
    }

    public CartPage2 removeProductFromCart() {
        trashIcon.click();
        return this;
    }

    public boolean isCartIsEmpty() {
        this.driver.navigate().refresh();
        return emptyCartNotification.getText().equalsIgnoreCase("Your shopping cart is empty.");
    }

    public String getTotalForProduct(){
        return totalForProduct.getText();
    }

    public String getTotalProducts(){
        return totalProducts.getText();
    }

    public String getTotalShipping(){
        return totalShipping.getText();
    }

    public String getTotal(){
        return total.getText();
    }

    public String getTax(){
        return tax.getText();
    }

    public String getTotalAmount(){
        return totalAmount.getText();
    }
}
