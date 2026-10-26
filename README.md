
# DemoBlaze End-to-End Automation Testing Project

## Project Overview
This project automates end-to-end test scenarios for the DemoBlaze e-commerce website using Selenium WebDriver, Java, Cucumber, and TestNG.

The project uses the Page Object Model (POM) to organize page elements and reusable actions. Cucumber feature files describe test scenarios in simple Gherkin language.

## Application Under Test
- Website: https://www.demoblaze.com/
- Application Type: E-commerce website
- Testing Type: Web UI Automation and End-to-End Testing

## Tools and Technologies
- Java
- Selenium WebDriver
- Cucumber
- TestNG
- Maven (if configured)
- Chrome Browser
- Eclipse IDE
- Git and GitHub

## Project Structure

```text
Demoblaze_Project/
├── src/
│   └── test/
│       └── java/
│           ├── base/
│           │   └── Basetest.java
│           ├── pages/
│           │   ├── Login.java
│           │   └── SignUp.java
│           ├── Runner/
│           │   └── runner.java
│           └── stepdefinitions/
│               └── PurchaseTestE2E.java
├── features/
│   └── featuresE2E.feature
├── pom.xml
└── README.md
```

*Adjust the structure according to your actual project folders.*

## Project Components

### 1. Base Test Class
The `Basetest` class initializes ChromeDriver, opens the DemoBlaze website, maximizes the browser, sets an implicit wait of five seconds, and closes the browser session.

### 2. Sign Up Page
The `SignUp` class contains reusable methods to open the signup dialog, enter a username and password, and submit the signup form. The username is generated dynamically to help avoid duplicate usernames.

### 3. Login Page
The `Login` class contains locators and reusable methods to open the login dialog, enter credentials, and submit the login form.

### 4. Cucumber Feature File
The `featuresE2E.feature` file defines four scenarios using Gherkin syntax:

1. Verify that a user can sign up successfully.
2. Verify that a user can log in successfully.
3. Verify that a product can be added to the cart.
4. Verify that a user can log out successfully.

### 5. Step Definitions
The `PurchaseTestE2E` class connects Gherkin steps to Java methods and uses TestNG assertions to validate signup alert text.

### 6. Test Runner
The `runner` class extends `AbstractTestNGCucumberTests` and configures the feature file, step definition package, console output, and HTML report.

## Test Scenarios

| Scenario | Purpose |
|---|---|
| User Sign Up | Verify the signup process and success alert |
| User Login | Verify login with valid credentials |
| Add Product to Cart | Verify product selection and cart functionality |
| User Logout | Verify that a user can log out |

**Note:** The feature file defines all four scenarios, but the login, cart, and logout step-definition methods are currently empty. Those scenarios require implementation before they can be considered successfully automated.

## How to Run the Project

1. Clone or download this repository.
2. Import the project into Eclipse as an Existing Maven Project, if applicable.
3. Wait for the required dependencies to download.
4. Ensure Java and Chrome are installed.
5. Open the `runner` class.
6. Right-click and select Run As → TestNG Test.
7. Review the test execution results.

## Test Reporting
The runner is configured to generate a Cucumber HTML report at:

`target/cucumberReport.html`

## Learning Outcomes
- Selenium WebDriver automation.
- Page Object Model (POM).
- Cucumber and Gherkin syntax.
- TestNG integration and assertions.
- End-to-end testing concepts.
- Git and GitHub project management.

## Author
Samruddhi Jagtap

## GitHub Repository
https://github.com/Samuuj9922/Demoblaze_Project
