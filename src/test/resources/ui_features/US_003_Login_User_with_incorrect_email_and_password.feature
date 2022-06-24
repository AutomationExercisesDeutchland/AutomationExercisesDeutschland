@US03 @SmokeTest
Feature: US_003_Login_User_with_incorrect_email_and_password
  Background: User is on the Automation Exercise homepage
    Given User go to homepage
    Given Verify that home page is visible successfully

Scenario: TC01 User cannot login with invalid email and password

  And Click on Signup - Login button
  Then Verify that 'Login to your account' is visible
  When Enter an unregistered email address and password
  And User Clicks login button
  Then Verify 'Your email or password is incorrect!' is visible
