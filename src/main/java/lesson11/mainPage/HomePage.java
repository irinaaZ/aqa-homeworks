package lesson11.mainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private static final String HOMEPAGE_URL = "http://automationpractice.com";
    private static final String DRESSES_URL = "http://automationpractice.com/index.php?id_category=8&controller=category";
    private WebDriver driver;

    @FindBy(css = ".sf-menu > li:nth-child(2) > a:nth-child(1)")
    private WebElement dressesLink;

    @FindBy(css = "#layered_id_feature_18")
    private WebElement colorfulDressCheckBox;

    @FindBy(className = "button ajax_add_to_cart_button btn btn-default")
    private WebElement addToCartButton;

    @FindBy(className = ".icon-ok")
    private WebElement cartNotification;

    public HomePage ( WebDriver driver ) {
        this.driver = driver;
        PageFactory.initElements (driver,this);
    }

    public HomePage openPage ( ) {
        this.driver.navigate ( ).to (HOMEPAGE_URL);
        return this;
    }

    public HomePage moveToDressesLink ( ) {
        dressesLink.click ( );
        return this;
    }

    public HomePage checkBoxClicking ( ) {
        colorfulDressCheckBox.click ( );
        return this;
    }

    public HomePage addDressToCart ( ) {
        addToCartButton.click ( );
        return this;
    }

    public boolean isCartIsNotEmpty ( ) {
        return cartNotification.getText ( ).equalsIgnoreCase ("Product successfully added to your shopping cart");
    }

    public boolean isCurrentPageIsCorrect( ){
        String currentPage = null;
        currentPage = this.driver.getCurrentUrl ();
        return currentPage.equals (DRESSES_URL);
    }
}
