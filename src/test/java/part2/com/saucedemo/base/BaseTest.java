package part2.com.saucedemo.base;

import com.base.BasePage;
import com.saucedemo.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private static final Logger log = LoggerFactory.getLogger(BaseTest.class);
    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPage loginPage;
    private String url = "https://www.saucedemo.com";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();    // Can use EdgeDriver for Microsoft Edge, Safari, Firefox
        driver.manage().window().maximize();

        // Loading the application
        driver.get(url);

        // Instance of the BasePage
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
