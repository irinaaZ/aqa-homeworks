import lesson8.task2.RegistrationPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationPageTest {
    private WebDriver driver;
    private RegistrationPage registrationPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\My data\\study\\AQA\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        this.registrationPage = new RegistrationPage(this.driver);
    }

    @Test
    public void canDisplayErrorAlert() {
        Assert.assertTrue(
                registrationPage.openRegistrationPage()
                        .openSignIn()
                        .enterEmailAndClickTheButton()
                        .toFillInAllDataWithoutDropDowns()
                        .isErrorAlertPresented());
    }
}
