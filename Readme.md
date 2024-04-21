# NETFLIX SELENIUM TEST AUTOMATION

Welcome to the Netflix automation project! This project demonstrates how to automate interaction with the Netflix website using Selenium WebDriver and Java. The code logs into a Netflix account with provided credentials and performs some predefined actions.

## Table of Contents

- [Project Description](#project-description)
- [Usage](#usage)
- [Dependencies](#dependencies)
- [Scenario](#scenario)
    - [Goal](#goal)
    - [Steps](#steps)
- [License](#license)

## Project Description

This code automates the login process on the Netflix website. It uses Selenium WebDriver and Chrome WebDriver to interact with the Netflix website, enters user credentials, and performs some operations on the website.

## Usage

To use this code:

1. Compile and run the `netflix` class. Ensure you have set the appropriate Netflix account credentials in the code.

2. The code initializes the WebDriver, navigates to the Netflix website, logs in using the provided credentials, and performs the actions defined in the code.

## Dependencies

This project relies on the following dependencies:

- **Selenium WebDriver**: A library that allows you to automate web browser actions.
- **WebDriverManager**: A library that manages the installation and setup of WebDriver binaries.
- **Chrome WebDriver**: The Chrome browser driver, which you can install using WebDriverManager.

To install the dependencies, you can use a build tool such as Maven or Gradle to manage them, or you can install them manually.

## Scenario

### Goal

Your goal is to automate the login process on the Netflix website to verify that users can successfully log in using valid credentials. You want to streamline the testing process by writing an automated script that logs into the Netflix website using provided email and password credentials, then verifies that the login is successful.

### Steps

1. **Prepare the Code**: The provided Java code already includes the necessary methods for automating the login process. The script initializes the WebDriver, navigates to the Netflix website, and enters the provided credentials.

2. **Set Up Credentials**: Before running the code, update the `email` and `password` variables in the `netflix` class with valid Netflix account credentials. This step is crucial for a successful login.

3. **Run the Code**: Compile and execute the `netflix` class. The code will launch the Chrome browser, navigate to the Netflix website, and perform the login process using the provided credentials.

4. **Verify Login**: Observe the browser after running the code. If the login is successful, you should see the Netflix homepage or dashboard.

5. **Automate Verification**: To fully automate the verification process, you could add code to check if certain elements are present on the page after login, such as a user profile or specific menus. This way, the script can automatically confirm whether the login was successful.

6. **Log Results**: Add logging or assertions to the script to track the outcome of each login attempt. This will help you analyze the test results and identify any issues.

7. **Cleanup**: Once the test is complete, ensure that the browser is closed using the `driver.quit()` method to free up resources.

