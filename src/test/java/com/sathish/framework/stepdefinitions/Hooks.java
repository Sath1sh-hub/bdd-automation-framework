package com.sathish.framework.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import com.sathish.framework.base.DriverFactory;
import com.sathish.framework.utilities.ExtentTestManager;
import com.sathish.framework.utilities.ScreenshotUtil;

public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        DriverFactory.initDriver();
        ExtentTestManager.startTest(scenario.getName());
    }

    @After
    public void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            String screenshotPath = ScreenshotUtil.captureScreenshot(scenario.getName());
            ExtentTestManager.getTest().fail("Test Failed").addScreenCaptureFromPath(screenshotPath);
        } else {
            ExtentTestManager.getTest().pass("Test Passed");
        }

        DriverFactory.quitDriver();
        ExtentTestManager.flush();
    }
}