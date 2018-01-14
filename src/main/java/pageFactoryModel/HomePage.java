package pageFactoryModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class HomePage  extends BaseClass{



    public HomePage()
    {

        PageFactory.initElements(driver,this);
    }
    // find sing in Locator
    @FindBy(className = "login")
    WebElement loginField;

    // find Top Menu -Women Categories Locator
   // @FindBy(xpath="a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']")
    @FindBy(css="a[href^='http://automationpractice.com/index.php?id_category=3&controller=category']")
    WebElement womenCategoryField;


    public void goToLoginPage()
    {
        loginField.click();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    public  void goToWomenCategory()
    {

        womenCategoryField.click();
    }

}
