package dataProvider;

import lesson11.dataProvider.RegistrationPageDP;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationPageDPTest {
    private WebDriver driver;
    private RegistrationPageDP registrationPageDP = new RegistrationPageDP(this.driver);

    private final String ERROR_AUTHENTIFICATION_MESSAGE = "Authentication failed.";
    private final String EMPTY_PASSWORD_MESSAGE = "Password is required.";
    private final String INCORRECT_EMAIL_MESSAGE = "Invalid email address.";
    private final String EMPTY_EMAIL_MESSAGE = "An email address required.";


    @DataProvider (name = "Registration page")
    public Object[][] emailAndPasswordData() {
        return new Object[][]{
                {"myemailiswrond@com.ua", "313323232"},
                {"myemailiswrond@com.ua", " "},
                {"myemailiswrond", "323232323"},
                {" ", "313323232"},
                {" ", " "},
        };
    }

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\My data\\study\\AQA\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        this.registrationPageDP = new RegistrationPageDP(this.driver);
    }

    @Test(dataProvider = "Registration page")
    public void errorMessageOnLoginWithBadCredentials(String email, String password) {

        registrationPageDP.openRegistrationPage();
        registrationPageDP.openSignIn();
        Assert.assertTrue(registrationPageDP.loginAndClickSubmitButton(email, password)
                .isErrorAlertPresentedForIncorrectEmailAndPassword(ERROR_AUTHENTIFICATION_MESSAGE));
        Assert.assertTrue(registrationPageDP.loginAndClickSubmitButton(email, password)
                .isErrorAlertPresentedForIncorrectEmailAndPassword(EMPTY_PASSWORD_MESSAGE));
        Assert.assertTrue(registrationPageDP.loginAndClickSubmitButton(email, password)
                .isErrorAlertPresentedForIncorrectEmailAndPassword(INCORRECT_EMAIL_MESSAGE));
        Assert.assertTrue(registrationPageDP.loginAndClickSubmitButton(email, password)
                .isErrorAlertPresentedForIncorrectEmailAndPassword(EMPTY_EMAIL_MESSAGE));
        Assert.assertTrue(registrationPageDP.loginAndClickSubmitButton(email, password)
                .isErrorAlertPresentedForIncorrectEmailAndPassword(EMPTY_EMAIL_MESSAGE));
    }
}

