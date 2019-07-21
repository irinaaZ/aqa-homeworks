package mainPage;

import lesson10.WebDriverType;
import lesson11.mainPage.HomePage;
import listeners.Listener;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

@Listeners(Listener.class)
public class HomePageTest {

    private WebDriver driver;
    private HomePage homePage;

    @BeforeClass
    public void logSmth(){
        System.out.println ("home page" );
    }

    @BeforeMethod
    public void logInfo ( ) {
        System.out.println ("testing of home page started");
    }

    @BeforeTest
    public void setUp() {
        this.driver = WebDriverType.CHROME.create();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        this.homePage = new HomePage(this.driver);
    }

    @Test(groups = "smoke")
    public void canAddDressToCart(){
        homePage.openPage ();
        homePage.moveToDressesLink ();
        homePage.checkBoxClicking ();
        homePage.addDressToCart ();
        Assert.assertTrue(homePage.isCartIsNotEmpty ());
    }

    @Test
    public void canDisplayCorrectUrl(){
        homePage.openPage ();
        homePage.moveToDressesLink ();
        Assert.assertTrue(homePage.isCurrentPageIsCorrect ());
    }

    @AfterMethod
    public void logInfo2 ( ) {
        System.out.println ("testing of home page finished");
    }

    @AfterTest
    public void cleanup() {
        driver.close();
    }
}

