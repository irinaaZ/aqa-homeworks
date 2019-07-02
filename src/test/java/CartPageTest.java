import lesson9.CartPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CartPageTest {
    private WebDriver driver;
    private CartPage cartPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\My data\\study\\AQA\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        this.cartPage = new CartPage(this.driver);
    }

    @Test
    public void canDisplayEmptyCart() {
        Assert.assertTrue(
                cartPage.openPage()
                        .searchBlouse()
                        .turnIntoListView()
                        .addProductIntoCart()
                        .proceedToCheckout()
                        .addQtyOfProducts()
                        .removeProductFromCart()
                        .isCartIsEmpty());
    }

    @Test
    public void canDisplayCorrectTotalValues() {
        this.cartPage.openPage();
        this.cartPage.searchBlouse();
        this.cartPage.turnIntoListView();
        this.cartPage.addProductIntoCart();
        this.cartPage.proceedToCheckout();
        this.cartPage.addQtyOfProducts();
        this.driver.navigate().refresh();
        String actualResultTotalForProduct = this.cartPage.getTotalForProduct();
        String expectedResultTotalForProduct = "$54.00";
        Assert.assertEquals("If test failed then total price for product is incorrect", expectedResultTotalForProduct, actualResultTotalForProduct);

        String actualResultTotalProducts = this.cartPage.getTotalProducts();
        String expectedResultTotalProducts = "$54.00";
        Assert.assertEquals("If test failed then total price for products is incorrect", expectedResultTotalProducts, actualResultTotalProducts);

        String actualResultTotalShipping = this.cartPage.getTotalShipping();
        String expectedResultTotalShipping = "$2.00";
        Assert.assertEquals("If test failed then total shipping is incorrect", expectedResultTotalShipping, actualResultTotalShipping);

        String actualResultTotal = this.cartPage.getTotal();
        String expectedResultTotal = "$56.00";
        Assert.assertEquals("If test failed then total is incorrect", expectedResultTotal, actualResultTotal);

        String actualResultTax = this.cartPage.getTax();
        String expectedResultTax = "$0.00";
        Assert.assertEquals("If test failed then tax is incorrect", expectedResultTax, actualResultTax);

        String actualResultTotalAmount = this.cartPage.getTotalAmount();
        String expectedResultTotalAmount = "$56.00";
        Assert.assertEquals("If test failed then total amount is incorrect", expectedResultTotalAmount, actualResultTotalAmount);
    }

    @After
    public void cleanup() {
        driver.close();
    }
}


