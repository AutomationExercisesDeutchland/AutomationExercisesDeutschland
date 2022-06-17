@US04 @SmokeTest

Feature: US_001_User_successfully_logout

  Background: User is on the Automation Exercise homepage
    Given User go to homepage
    Given Verify that home page is visible successfully

  Scenario: TC01 User should be able to successfully logout
    When Click on Signup - Login button
    And Verify that 'Login to your account' is visible
    When Enter an registered email address and password
    Then Click login button
    Then Verify that Logged in as username is visible as 'ali'
    Then Click Logout button
    Then Verify that user is navigated to login page


