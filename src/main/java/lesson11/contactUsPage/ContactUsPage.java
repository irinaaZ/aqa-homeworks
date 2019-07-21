package lesson11.contactUsPage;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
    private static final String CONTACT_US_URL = "http://automationpractice.com";
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"id_contact\"]")
    private WebElement subjectHandlingDropDown;

    @FindBy(id = "email")
    private WebElement emailAddressField;

    @FindBy(id = "id_order")
    private WebElement orderReferenceField;

    @FindBy(id = "message")
    private WebElement messageField;

    @FindBy(id = "submitMessage")
    private WebElement submitButton;

    @FindBy (css = "#center_column > div > ol > li")
    private WebElement errorNotificationLine;

    @FindBy (css = "#center_column > p")
    private WebElement successErrorNotification;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ContactUsPage openPage() {
        this.driver.navigate().to(CONTACT_US_URL);
        return this;
    }

    private ContactUsPage chooseSubjectFromDropDown(){
        Select subj = new Select(subjectHandlingDropDown);
        subj.selectByVisibleText("Customer service"); //Webmaster
        return this;
    }

    public ContactUsPage fillTheData() {
        chooseSubjectFromDropDown();
        emailAddressField.sendKeys("myEmail" + RandomStringUtils.randomNumeric(4) + "@mail.com");
        orderReferenceField.sendKeys(RandomStringUtils.randomAlphanumeric(9));
        messageField.sendKeys(RandomStringUtils.randomAlphabetic(50));
        clickSendButton ();
        return this;
    }

    public ContactUsPage fillTheDataWithEmptyMessage() {
        emailAddressField.sendKeys("myEmail" + RandomStringUtils.randomNumeric(4) + "@mail.com");
        clickSendButton ();
        return this;
    }

    public ContactUsPage leaveTheDataEmpty() {
        clickSendButton ();
        return this;
    }

    private ContactUsPage clickSendButton() {
        submitButton.click();
        return this;
    }

    public boolean isErrorNotificationDisplayesForEmailAddress(){
        return errorNotificationLine.getText ( ).contains ("Invalid email address.");
    }

    public boolean isErrorNotificationDisplayesForMessage(){
        return errorNotificationLine.getText ( ).contains ("The message cannot be blank.");
    }

    public boolean isSuccessNotificationPresented(){
        return successErrorNotification.getText ( ).contains ("Your message has been successfully sent to our team.");
    }
}
