package Tests;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import com.automation.remarks.testng.UniversalVideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Listeners (UniversalVideoListener.class)
public class LoginTest extends BaseTest {


LoginPage LoginPage;
HomePage HomePage;
CartPage CartPage;

    @BeforeClass
    @Parameters({"BrowserName"})

    public void setUp(@Optional("chrome") String BrowserName) throws AWTException, NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {

        setup(BrowserName);
        LoginPage = new LoginPage(driver);
        HomePage = new HomePage(driver);
        CartPage = new CartPage(driver);

    }

    @Video
    @Test(priority = 0)
    public void LoginToSauceDemoWebsite() throws Exception {

        logger = report.createTest("Login with standard user ");
        LoginPage.login("standard_user","secret_sauce");

    }


    @Video
    @Test(priority = 1)
    public void addProductsToCart() throws Exception {

        logger = report.createTest("Add products to cart ");
        HomePage.addProductsToCart();
    }



    @Video
    @Test(priority = 2)
    public void Checkout() throws Exception {

        logger = report.createTest("checkout ");
        CartPage.Checkout("John", "Doe", "12345");

    }

}
