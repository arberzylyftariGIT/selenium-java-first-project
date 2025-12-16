package part3_4.com.demoqa.tests.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("Arber Zylyftari");
        textBoxPage.setEmail("test@gmail.com");
        textBoxPage.setCurrentAddress("1234 Selenium Avenue");
        textBoxPage.setCurrentAddress("Suite 212");
        textBoxPage.setCurrentAddress("Tirana, Albania");
        textBoxPage.clickSubmitButton();

        String actualAddress = textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAddress.contains("Suite 212"),
                "\n Actual Address Does Not Contain Suite 212 \n");
    }
}

