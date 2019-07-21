package contactUsPage;

import lesson10.WebDriverType;
import lesson11.contactUsPage.ContactUsPage;
import listeners.Listener;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Listeners(Listener.class)
public class ContactUsPageTest {

    private WebDriver driver;
    private ContactUsPage contactUsPage;

    @BeforeMethod
    public void logInfo ( ) {
        System.out.println ("testing of contact us page started");
    }

    @BeforeTest
    public void setUp() {
        this.driver = WebDriverType.CHROME.create();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        this.contactUsPage = new ContactUsPage(this.driver);
    }

    @Test(groups = "regression")
    public void canDisplaySuccessNotification(){
        contactUsPage.openPage ();
        contactUsPage.fillTheData ();
        Assert.assertTrue(contactUsPage.isSuccessNotificationPresented ());
    }

    @Test(timeOut = 1000)
    public void canDisplayErrorNotification1(){
        contactUsPage.openPage ();
        contactUsPage.fillTheDataWithEmptyMessage ();
        Assert.assertTrue(contactUsPage.isErrorNotificationDisplayesForMessage ());
    }

    @Test
    public void canDisplayErrorNotification2(){
        contactUsPage.openPage ();
        contactUsPage.leaveTheDataEmpty ();
        Assert.assertTrue(contactUsPage.isErrorNotificationDisplayesForEmailAddress ());
    }
}

