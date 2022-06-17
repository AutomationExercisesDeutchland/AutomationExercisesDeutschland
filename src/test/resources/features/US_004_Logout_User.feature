@US04

Feature: US_001_User_successfully_registers_on_the_website

  Background: User is on the Automation Exercise homepage
    Given User go to homepage
    Given Verify that home page is visible successfully

  Scenario: TC01 User should be able to register with valid credentials
    When Click on Signup - Login button
    And Verify that 'Login to your account' is visible
    When Enter an registered email address and password
    Then Click login button
   # And Verify that 'Logged in as username' is visible
    Then Click Logout button
    Then Verify that user is navigated to login page


