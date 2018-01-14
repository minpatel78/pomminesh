import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageFactoryModel.*;

public class SmokeTestSuite extends BaseTest {
    HomePage hpage=new HomePage();
    LoginPage lpage=new LoginPage();
    CommonPage cpage=new CommonPage();
    NewUserRegistrationPage nuser=new NewUserRegistrationPage();
    ForgotPasswordPage fpasswordpage=new ForgotPasswordPage();

   // Test case 01
    @Test

    public void verifyUserLoginWithValidCredentials() {
        cpage.navigateToHomePage();
        username="mineshautomation@gmail.com";
        hpage.goToLoginPage();
        lpage.loginAs(username,password);
        // insert assertion here
        lpage.clickLogout();
        cpage.navigateToHomePage();
    }
    // Test Case 02
    @Test
    public void createNewUserRegistrationAccount()
    {

        cpage.navigateToHomePage();
        hpage.goToLoginPage();
        lpage.goToRegistrationPage(newUserEmailAddress);
        nuser.fillPersonalDetails();
        nuser.fillAddressDetails();
        nuser.fillContactDetails();
       // nuser.clickRegister();
        // insert assertion here
        lpage.clickLogout();
        cpage.navigateToHomePage();

    }

//Test Case 03
    @Test
    public void navigateToForgotPasswordPage()
    {
            hpage.goToLoginPage();
            lpage.clickForgotPasswordLink();

        // insert assertion here
    }

    //Test Case 04

   @Test
    public void retrieveUserPassword()
    {
        hpage.goToLoginPage();
        lpage.clickForgotPasswordLink();
        String alertmessage=fpasswordpage.retrievePassword();
        Assert.assertTrue(alertmessage.contains(username));

    }
    // Test Case 05
    @Test
    public void goToWomenCategoryFromTopMenu()
    {
        //cpage.navigateToHomePage();

        hpage.goToWomenCategory();
    }
}
