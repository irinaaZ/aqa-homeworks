package lesson9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private static final String PAGE_URL = "http://automationpractice.com";
    private WebDriver driver;

    private By searchField = By.cssSelector("#search_query_top");
    private By searchButton = By.xpath("//*[@id=\"searchbox\"]/button");
    private By listIcon = By.xpath("//*[@id=\"list\"]/a/i");
    private By addToCartButton = By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[1]");
    private By proceedToCheckoutButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
    private By addQty = By.xpath("//*[@id=\"cart_quantity_up_2_7_0_0\"]");
    private By totalForProduct = By.xpath("//*[@id=\"total_product_price_2_7_0\"]");
    private By totalProducts = By.xpath("//*[@id=\"total_product\"]");
    private By totalShipping = By.xpath("//*[@id=\"total_shipping\"]");
    private By total = By.xpath("//*[@id=\"total_price_without_tax\"]");
    private By tax = By.xpath("//*[@id=\"total_tax\"]");
    private By totalAmount = By.xpath("//*[@id=\"total_price\"]");
    private By trashIcon = By.xpath("//*[@id=\"2_7_0_0\"]");
    private By emptyCartNotification = By.xpath("//*[@id=\"center_column\"]/p");


    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage openPage() {
        this.driver.navigate().to(PAGE_URL);
        return this;
    }

    public CartPage searchBlouse() {
        WebElement webElementSearchField = this.driver.findElement(searchField);
        webElementSearchField.sendKeys("Blouse");
        this.driver.findElement(searchButton).click();
        return this;
    }

    public CartPage turnIntoListView() {
        this.driver.findElement(listIcon).click();
        return this;
    }

    public CartPage addProductIntoCart() {
        this.driver.findElement(addToCartButton).click();
        return this;
    }

    public CartPage proceedToCheckout() {
        this.driver.findElement(proceedToCheckoutButton).click();
        return this;
    }

    public CartPage addQtyOfProducts() {
        this.driver.findElement(addQty).click();
        return this;
    }

    public CartPage removeProductFromCart() {
        this.driver.findElement(trashIcon).click();
        return this;
    }

    public boolean isCartIsEmpty() {
        this.driver.navigate().refresh();
        return this.driver.findElement(emptyCartNotification).getText().equalsIgnoreCase("Your shopping cart is empty.");
    }

    public String getTotalForProduct(){
        WebElement totalForProductEl = this.driver.findElement(totalForProduct);
        return totalForProductEl.getText();
    }

    public String getTotalProducts(){
        WebElement totalProductsEl = this.driver.findElement(totalProducts);
        return totalProductsEl.getText();
    }

    public String getTotalShipping(){
        WebElement totalShippingEl = this.driver.findElement(totalShipping);
        return totalShippingEl.getText();
    }

    public String getTotal(){
        WebElement totalEl = this.driver.findElement(total);
        return totalEl.getText();
    }

    public String getTax(){
        WebElement taxEl = this.driver.findElement(tax);
        return taxEl.getText();
    }

    public String getTotalAmount(){
        WebElement totalAmountEl = this.driver.findElement(totalAmount);
        return totalAmountEl.getText();
    }
}

