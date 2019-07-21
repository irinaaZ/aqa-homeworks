package lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPageMain extends RegistrationPageBuilder {
    private String email;
    private String password;
    private String zip;
    private String city;
    private String country;
    private String address;
    private String phone;
    private String firstName;
    private String lastName;
    private String mobile;

    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private WebDriver driver;

    @FindBy(xpath = "//a[@class='login']")
    private WebElement signIn;

    @FindBy(id = "email_create")
    private WebElement emailAddressField;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameYourPersonalInfo;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameYourPersonalInfo;

    @FindBy(id = "passwd")
    private WebElement passwordYourPersonalInfo;

    @FindBy(id = "address1")
    private WebElement addressYourAddress;

    @FindBy(id = "city")
    private WebElement cityYourAddress;

    @FindBy(id = "postcode")
    private WebElement zipYourAddress;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhoneYourAddress;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    private WebElement errorsAlert;

    @FindBy(id = "id_country")
    private WebElement countryDropDownYourAddress;

    public RegistrationPageMain openRegistrationPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public RegistrationPageMain openSignIn(){
        signIn.click();
        return this;
    }

    public RegistrationPageMain enterEmailAndClickTheButton(String email){
        emailAddressField.sendKeys(email);
        createAnAccountButton.click();
        return this;
    }

    private RegistrationPageMain chooseValueFromCountryDropDown(){
        Select dtpCountry = new Select(countryDropDownYourAddress);
        dtpCountry.selectByVisibleText("-");
        return this;
    }

    private RegistrationPageMain clickRegistrationButton(){
        registerButton.click();
        return this;
    }

    public boolean isErrorAlertPresented(){
        return errorsAlert.getText().contains("There are 3 errors");
    }

    public RegistrationPageMain(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RegistrationPageMain toFillInAllDataWithoutDropDowns(RegistrationPageBuilder registrationPageBuilder){
        registrationPageBuilder.getFirstName();
        registrationPageBuilder.getLastName();
        registrationPageBuilder.getPassword();
        registrationPageBuilder.getAddress();
        registrationPageBuilder.getCity();
        registrationPageBuilder.getZip();
        registrationPageBuilder.getMobile();
        registrationPageBuilder.getPhone();
        chooseValueFromCountryDropDown();
        clickRegistrationButton();
        return this;
    }

    public RegistrationPageMain(String email, String password, String zip, String city, String country, String address, String phone, String firstName, String lastName, String mobile) {
        this.email = email;
        this.password = password;
        this.zip = zip;
        this.city = city;
        this.country = country;
        this.address = address;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
    }

    public RegistrationPageMain(){
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
