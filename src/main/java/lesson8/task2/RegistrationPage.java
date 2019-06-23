package lesson8.task2;

import org.openqa.selenium.support.ui.Select;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private WebDriver driver;
    String email = "mail_iz_" + RandomStringUtils.randomNumeric(3) + "@mail.com";
    String password = RandomStringUtils.randomNumeric(7);
    String zip = RandomStringUtils.randomNumeric(5);
    String phone = RandomStringUtils.randomNumeric(11);

    private By signIn = By.xpath("//a[@class='login']");
    private By emailAddressField = By.id("email_create");
    private By createAnAccountButton = By.id("SubmitCreate");
    private By firstNameYourPersonalInfo = By.id("customer_firstname");
    private By lastNameYourPersonalInfo = By.id("customer_lastname");
    private By passwordYourPersonalInfo = By.id("passwd");
//    private By firstNameYourAddress = By.id("firstname");
//    private By lastNameYourAddress = By.id("lastname");
    private By addressYourAddress = By.id("address1");
    private By cityYourAddress = By.id("city");
    private By zipYourAddress = By.id("postcode");
    private By mobilePhoneYourAddress = By.id("phone_mobile");
//    private By addressAliasYourAddress = By.id("alias");
    private By registerButton = By.id("submitAccount");
    private By errorsAlert = By.xpath("//*[@id=\"center_column\"]/div/p");
    private By countryDropDownYourAddress = By.id("id_country");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public RegistrationPage openRegistrationPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public RegistrationPage openSignIn(){
        this.driver.findElement(signIn).click();
        return this;
    }

    public RegistrationPage enterEmailAndClickTheButton(){
        WebElement element = driver.findElement(emailAddressField);
        element.sendKeys(email);
        this.driver.findElement(createAnAccountButton).click();
        return this;
    }

    private RegistrationPage chooseValueFromCountryDropDown(){
        Select dtpCountry = new Select(driver.findElement(countryDropDownYourAddress));
        dtpCountry.selectByVisibleText("-");
        return this;
    }

    public RegistrationPage toFillInAllDataWithoutDropDowns(){
        this.driver.findElement(firstNameYourPersonalInfo).sendKeys("FIRSTNAME");
        this.driver.findElement(lastNameYourPersonalInfo).sendKeys("LASTNAME");
        this.driver.findElement(passwordYourPersonalInfo).sendKeys(password);
        this.driver.findElement(addressYourAddress).sendKeys("ADDRESS");
        this.driver.findElement(cityYourAddress).sendKeys("CITY");
        this.driver.findElement(zipYourAddress).sendKeys(zip);
        this.driver.findElement(mobilePhoneYourAddress).sendKeys(phone);
        this.driver.findElement(mobilePhoneYourAddress).sendKeys(phone);
        chooseValueFromCountryDropDown();
        clickRegistrationButton();
        return this;
    }

    private RegistrationPage clickRegistrationButton(){
        this.driver.findElement(registerButton).click();
        return this;
    }

    public boolean isErrorAlertPresented(){
        return this.driver.findElement(errorsAlert).isDisplayed();
    }
}

