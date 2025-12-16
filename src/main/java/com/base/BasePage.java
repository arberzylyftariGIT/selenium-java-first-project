// Page Object Model -- Main Page

package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void set(By locator, String text) {
        find(locator).clear();  // If there is data clear them
        find(locator).sendKeys(text);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    // Sleep statement only for demo purposes, not necessary when working on real projects
    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}
