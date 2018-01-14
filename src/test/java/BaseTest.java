import org.junit.AfterClass;
import org.junit.BeforeClass;
import pageFactoryModel.BaseClass;

public class BaseTest extends BaseClass{
    @BeforeClass
    public static void beforeClass() {
        openBrowser();
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
       // closeBrowser();
    }

}
