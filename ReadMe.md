# Netflix Selenium Test Automation

This project is a Java project that uses Selenium to perform automation testing for Netflix.

## Requirements

- Java JDK 8 or higher
- Maven
- Google Chrome browser

## WebDriver Management

WebDriverManager is used to manage WebDriver in this project. It allows WebDriver to be downloaded and managed automatically.

## Test Scenarios
- Description:** User attempts to log in with an invalid username and password.
- **Steps:**
  1. Open the Netflix home page.
  2. Close the pop-up.
  3. Enter an invalid username. 
  4. Enter an invalid password.
  5. Click the login button.
- **Expected Result:** The user receives an appropriate error message in case of incorrect login.