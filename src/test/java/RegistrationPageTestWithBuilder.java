import lesson10.RegistrationPageBuilder;
import lesson10.RegistrationPageMain;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationPageTestWithBuilder {
    private RegistrationPageMain registrationPageMain;
    private WebDriver driver;

    @Before
    public void createAccount() {
        registrationPageMain = new RegistrationPageBuilder()
                .withAddress("ADDRESS")
                .withCity("CITY")
                .withCountry("COUNTRY")
                .withZip(RandomStringUtils.randomNumeric(5))
                .withEmail("mail_iz_" + RandomStringUtils.randomNumeric(3) + "@mail.com")
                .withPassword(RandomStringUtils.randomNumeric(7))
                .withPhone(RandomStringUtils.randomNumeric(11))
                .withMobile(RandomStringUtils.randomNumeric(13))
                .withFirstName("FIRST NAME")
                .withLastName("LAST NAME")
                .build();

        System.setProperty("webdriver.chrome.driver", "C:\\My data\\study\\AQA\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        this.registrationPageMain = new RegistrationPageMain(this.driver);
    }

    @Test
    public void canDisplayErrorAlert() {
        Assert.assertTrue(
                registrationPageMain.openRegistrationPage()
                        .openSignIn()
                        .enterEmailAndClickTheButton(registrationPageMain.getEmail())
                        .toFillInAllDataWithoutDropDowns(registrationPageMain)
                        .isErrorAlertPresented());
    }
}

