
# 🛒 Demoblaze Website Automation Testing Project

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Cucumber](https://img.shields.io/badge/Cucumber-23D96C?style=for-the-badge&logo=cucumber&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF6F00?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

![Project Status](https://img.shields.io/badge/Project-In%20Progress-orange?style=flat-square)

## 🔵 Project Overview

This project focuses on automating important user flows of the **Demoblaze e-commerce website** using Selenium WebDriver, Java, Cucumber, and TestNG.

The project follows the **Page Object Model (POM)** approach to keep page locators and actions separate from test steps.

The goal is to practice web application automation, BDD-style test scenarios, and end-to-end testing.

🌐 **Application Under Test:** https://www.demoblaze.com/

## 🟢 Objectives

- Automate the user sign-up process.
- Practice login functionality testing.
- Test product selection and add-to-cart functionality.
- Practice logout functionality testing.
- Write readable scenarios using Cucumber feature files.
- Organize page actions using the Page Object Model.
- Generate an HTML test report.

## 🟠 Technologies and Tools Used

| Technology / Tool | Purpose |
|---|---|
| Java | Programming language |
| Selenium WebDriver | Browser automation |
| Cucumber | BDD-style test scenarios |
| TestNG | Test execution framework |
| Chrome | Browser for testing |
| Eclipse IDE | Development environment |
| Maven | Dependency management, if configured |
| Git and GitHub | Version control and project hosting |

## 🟣 Project Structure

```text
Demoblaze_Project/
│
├── src/
│   └── test/
│       └── java/
│           ├── base/
│           │   └── Basetest.java
│           │
│           ├── pages/
│           │   ├── Login.java
│           │   └── SignUp.java
│           │
│           ├── Runner/
│           │   └── runner.java
│           │
│           └── stepdefinitions/
│               └── PurchaseTestE2E.java
│
├── features/
│   └── featuresE2E.feature
│
├── pom.xml
│
└── README.md
```



## 🔴 Test Scenarios

The feature file defines the following scenarios:

### 1. User Sign-Up

- Open the Demoblaze website.
- Click the Sign Up button.
- Enter a username and password.
- Submit the sign-up form.
- Verify the success alert.

### 2. User Login

- Open the Demoblaze website.
- Click the Log In button.
- Enter valid credentials.
- Submit the login form.
- Verify successful login.

### 3. Add Product to Cart

- Open the Demoblaze website.
- Select a phone from the product category.
- Click Add to Cart.
- Verify that the product is added successfully.

### 4. User Logout

- Open the Demoblaze website.
- Log in with valid credentials.
- Click Log Out.
- Verify that the user is logged out.

**Implementation status:** The sign-up steps are implemented in the provided code. The login, cart, and logout step-definition methods are currently empty and need to be completed before those scenarios can be considered automated.

## 🟡 Framework Design

### Page Object Model (POM)

The project uses separate classes for browser setup and page-level actions.

- **Basetest.java:** Launches Chrome, opens the website, maximizes the window, and sets an implicit wait.
- **SignUp.java:** Stores sign-up locators and actions.
- **Login.java:** Stores login locators and actions.
- **PurchaseTestE2E.java:** Contains Cucumber step definitions.
- **runner.java:** Configures Cucumber execution and the HTML report.

## 🟤 Browser Setup

The base test class performs these actions:

1. Launches the Chrome browser.
2. Opens https://www.demoblaze.com/.
3. Maximizes the browser window.
4. Sets an implicit wait of five seconds.
5. Closes the browser using `driver.quit()` when cleanup is called.

## 🔵 How to Run the Project

1. Clone or download this repository.
2. Import the project into Eclipse.
3. Make sure Java, Selenium, Cucumber, and TestNG dependencies are configured.
4. Confirm that the feature-file path and Cucumber glue package match the project structure.
5. Open `runner.java`.
6. Run it as a TestNG test.
7. Check the generated report after execution.

## 🟢 Test Report

The Cucumber runner is configured to generate an HTML report at:

```text
target/cucumberReport.html
```

The report is generated when the test execution and report configuration run successfully.

## 🟠 Skills Practiced

- Manual and automation testing concepts
- Selenium WebDriver
- Java programming
- Cucumber feature files and step definitions
- Page Object Model (POM)
- TestNG test execution
- Web element locators
- End-to-end testing
- Git and GitHub

## 🟣 Future Improvements

- Complete login automation and validation.
- Implement add-to-cart and cart verification.
- Implement logout and login-state validation.
- Add assertions for each completed scenario.
- Improve handling of alerts and synchronization.
- Add screenshots for failed test cases.
- Improve test data management.
- Integrate the project with a continuous integration tool.

## 🔴 Author

**Samruddhi Jagtap**

Computer Engineering Graduate | QA Testing Fresher

GitHub: [Samuuj9922](https://github.com/Samuuj9922)

Project Repository: [Demoblaze_Project](https://github.com/Samuuj9922/Demoblaze_Project)

---


