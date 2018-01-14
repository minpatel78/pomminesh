package pageFactoryModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ForgotPasswordPage extends BaseClass
{
    public ForgotPasswordPage()
    {
        PageFactory.initElements(driver,this);
    }




    @FindBy(id= "email")
    WebElement retrieveEmailField;

    @FindBy(xpath= "//*[@id=\"form_forgotpassword\"]/fieldset/p/button")
    WebElement retrievePasswordButton;
    // Retrive password method

    @FindBy(xpath= "//*[@id=\"center_column\"]/div/p")
    WebElement alertMessage;

    public String retrievePassword()
    {
        retrieveEmailField.sendKeys(username);
        retrievePasswordButton.click();

        String message="";
        if(alertMessage.isDisplayed())
        {

             message =alertMessage.getText();

        }

        return message;

    }
}
