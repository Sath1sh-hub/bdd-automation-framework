# BDD Automation Framework

This project is a basic BDD automation framework built using Selenium WebDriver, Java, Cucumber, TestNG, and Maven. It follows the Page Object Model design pattern and is designed for maintainable and reusable UI test automation.

## Tech Stack
- Java
- Selenium WebDriver
- Cucumber
- TestNG
- Maven

## Features
- Page Object Model (POM)
- Cucumber BDD feature files
- TestNG runner integration
- Hooks for setup and teardown
- ConfigReader for centralized configuration
- Wait utility for reusable explicit waits
- Screenshot capture on failure
- Extent Reports with step-level logging
- Tag-based execution
- Parallel execution
- Parameterized testing using Scenario Outline and Examples

## Project Structure
src/main/java
- base
- pages
- utilities

src/test/java
- dataprovider
- runners
- stepdefinitions

src/test/resources
- features
- config.properties
- log4j2.xml

testdata
- loginData.xlsx

## Sample Covered Scenarios
- Valid login
- Invalid login
- Logout

## How to Run
1. Clone the repository
2. Import as a Maven project in Eclipse
3. Update Maven dependencies
4. Run `TestRunner.java` as TestNG Test

## Notes
This project was built as a hands-on framework practice project to strengthen automation testing skills in Selenium, Java, Cucumber, and TestNG.
