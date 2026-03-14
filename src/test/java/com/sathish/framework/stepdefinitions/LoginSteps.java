package com.sathish.framework.stepdefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.sathish.framework.pages.LoginPage;
import com.sathish.framework.utilities.ExtentTestManager;

import io.cucumber.java.en.*;

public class LoginSteps {

    private static final Logger logger = LogManager.getLogger(LoginSteps.class);
    LoginPage loginPage = new LoginPage();

    @Given("user is on login page")
    public void user_is_on_login_page() {
        logger.info("Navigating to login page");
        ExtentTestManager.getTest().info("Navigated to login page");
        loginPage.navigateToLoginPage();
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        logger.info("Entering username and password");
        ExtentTestManager.getTest().info("Entered username: " + username);
        ExtentTestManager.getTest().info("Entered password");
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("clicks login button")
    public void clicks_login_button() {
        logger.info("Clicking login button");
        ExtentTestManager.getTest().info("Clicked login button");
        loginPage.clickLoginButton();
    }

    @Then("user should see {string} message")
    public void user_should_see_message(String result) {
        String message = loginPage.getFlashMessage();
        logger.info("Validating login result: {}", result);
        ExtentTestManager.getTest().info("Actual message: " + message);

        if (result.equalsIgnoreCase("success")) {
            Assert.assertTrue(message.contains("You logged into a secure area!"));
            logger.info("Success message validated");
            ExtentTestManager.getTest().pass("Success message validated");
        } else {
            Assert.assertTrue(
                message.contains("Your username is invalid!")
                || message.contains("Your password is invalid!")
            );
            logger.info("Failure message validated");
            ExtentTestManager.getTest().pass("Failure message validated");
        }
    }
}