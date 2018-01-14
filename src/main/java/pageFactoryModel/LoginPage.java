package pageFactoryModel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BaseClass {

    public LoginPage()
    {

        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "passwd")
    WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    WebElement submitButton;

    @FindBy(className = "logout")
    WebElement logoutButton;

    @FindBy(id = "email_create")
    WebElement createAccountField;

    @FindBy(id = "SubmitCreate")
    WebElement submitCreateButton;
// forgot password link locator

    @FindBy(xpath="//a[@href='http://automationpractice.com/index.php?controller=password']")
    WebElement forgotPasswordLink;
//set username in email field
    public void setEmailField( String user1)
    {
        emailField.sendKeys(user1);

    }
    public void createEmailField(String newuseremail)
    {
        createAccountField.sendKeys(newuseremail);
    }
    public void clickCreateAccountSubmitButton()
    {
        submitCreateButton.click();

    }

    public void setPasswordField(String password1)
    {
        passwordField.sendKeys(password1);

    }
    public void clickLogin()
    {
        submitButton.click();
    }
    public void loginAs(String user1, String password1)
    {
        // fill username (email address)
        this.setEmailField(user1);
        // fill password
        this.setPasswordField(password1);
        clickLogin();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    public void clickLogout()
    {
        logoutButton.click();

    }
    public void goToRegistrationPage(String newUserEmailAddress)
    {
        this.createEmailField(newUserEmailAddress);
        this.clickCreateAccountSubmitButton();

    }

    public void clickForgotPasswordLink()
    {
        forgotPasswordLink.click();

    }

}
