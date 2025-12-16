package part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogInShouldFailTest {

    WebDriver driver; //Control the browser and help find elements

    @BeforeClass    // Running this code before the class
    public void setUp() {
        driver = new ChromeDriver();    // Instance of ChromeDriver
        driver.manage().window().maximize();    //Maximizing the window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");     // 'Get' loads the new webpage
    }

    @AfterClass     // Helps clean up the test, it operates like a post condition
    public void tearDown() {
    //    driver.quit();      // Closing the browser
    //    driver.close();     // Closing the browser
        /* The difference between quit and close is that quit closes every window and quits the driver
           Meanwhile close only closes the current window
           The standard for selenium is to use 'driver.quit()'
        */
    }

    @Test       // Identifies the test method
    public void testLoggingIntoApplication() throws InterruptedException {
        /*
        When it comes to automation there are 2 key steps:
        First step -- Find the web element
        Second step -- Perform an action on the web element
         */

        Thread.sleep(2000);

        // First step: Finding an element
        // Finding the element by the selenium locate name
        WebElement username = driver.findElement(By.name("username"));

        // Second step: Performing an action with the element
        username.sendKeys("Admin");    // Method sendKeys sends information to the element

        var password = driver.findElement(By.name("password"));     // var -> Java keyword that infers the
                                                                    // data type based on driver.findElement
        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);

        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedResult = "Dashboard";

        Assert.assertNotEquals(actualResult, expectedResult);      // Verifying if the test passes

    }

}
