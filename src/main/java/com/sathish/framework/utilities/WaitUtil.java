package com.sathish.framework.utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sathish.framework.base.DriverFactory;

public class WaitUtil {

    public static void waitForElementVisible(WebElement element) {

        WebDriverWait wait = new WebDriverWait(
                DriverFactory.getDriver(),
                Duration.ofSeconds(10)
        );

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForElementClickable(WebElement element) {

        WebDriverWait wait = new WebDriverWait(
                DriverFactory.getDriver(),
                Duration.ofSeconds(10)
        );

        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}