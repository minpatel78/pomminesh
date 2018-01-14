
package pageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static String baseURL = "http://www.automationpractice.com";
    public static  String webDriverProfile="webdriver.chrome.driver";
    public static  String driverFilePath="src/main/resources/chromedriver.exe";
    public static String username = "mineshautomation@gmail.com";
    public static String password = "automation@123";
    public static String newUserEmailAddress="min@rediffmail.com";
    public static String newUserTitle="Mr.";
    public static String firstNameNewUser="Mukesh";
    public static String lastNameNewUser="Shah";
    public static String passwordNewUser="Testing@123";
    public static String day= "15";
    public static String month="January";
    public static String year="2000";
    public static String company="ABC Ltd";
    public static String addressLine1=" 11 First line Address";
    public static String addressLine2="  First Avenue";
    public static String cityName="  London";
    public static String stateName="Alabama";
    public static String postcode="30223";
    public static String countryName="  USA";
    public static String addInfo=" automation practice test";
    public static String homephonenumber = "0123456789";
    public static String mobilephonenumber="7777778888";
    public static String aliasaddress="MY Home";




    public static void openBrowser()
    {
        System.setProperty(webDriverProfile,driverFilePath);
        driver=new ChromeDriver();
        //System.out.println(" driver created");
    }

    public static void closeBrowser() {
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.close();
    }
}
