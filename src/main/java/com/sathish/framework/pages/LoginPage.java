package com.sathish.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sathish.framework.base.DriverFactory;
import com.sathish.framework.utilities.ConfigReader;
import com.sathish.framework.utilities.WaitUtil;

public class LoginPage {

    WebDriver driver;

    @FindBy(id="username")
    WebElement username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(css="button[type='submit']")
    WebElement loginButton;
    
    @FindBy(id = "flash")
    WebElement flashMessage;
    
    public LoginPage() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        driver.get(ConfigReader.getProperty("url"));
    }

    public void enterUsername(String user) {

        WaitUtil.waitForElementVisible(username);

        username.sendKeys(user);
    }

    public void enterPassword(String pass) {

        WaitUtil.waitForElementVisible(password);

        password.sendKeys(pass);
    }

    public void clickLoginButton() {

        WaitUtil.waitForElementClickable(loginButton);

        loginButton.click();
    }

    public String getSuccessMessage() {
        return flashMessage.getText();
    }
    
    public String getErrorMessage() {
        return flashMessage.getText();
    }
    
    public String getFlashMessage() {
        return flashMessage.getText();
    }
}