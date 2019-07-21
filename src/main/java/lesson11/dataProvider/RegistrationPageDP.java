package lesson11.dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageDP {
    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private WebDriver driver;

    @FindBy (id = "email")
    WebElement emailField;

    @FindBy (id = "passwd")
    WebElement passwordField;

    @FindBy (id = "SubmitLogin")
    WebElement submitButton;

    @FindBy (css = "#center_column > div:nth-child(2) > ol:nth-child(2) > li:nth-child(1)")
    WebElement errorMsgLine;

    @FindBy (className = "login")
    WebElement signIn;

    public RegistrationPageDP(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public RegistrationPageDP openRegistrationPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public RegistrationPageDP openSignIn(){
        signIn.click();
        return this;
    }

    public RegistrationPageDP loginAndClickSubmitButton (String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        submitButton.click();
        return this;
    }

    public boolean isErrorAlertPresentedForIncorrectEmailAndPassword(String message) {
        return errorMsgLine.getText().contains(message);
    }
}


