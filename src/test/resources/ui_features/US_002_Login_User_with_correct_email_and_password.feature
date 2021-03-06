@US02 @SmokeTest
Feature: US_002_Login_User_with_correct_email_and_password
  Background: User is on the Automation Exercise homepage
    Given User go to homepage
    Given Verify that home page is visible successfully

Scenario: TC01 User should be able to login with valid credentials

  And Click on Signup - Login button
  Then Verify that 'Login to your account' is visible
  When Enter an registered email address and password
  And User Clicks login button
  Then Verify that Logged in as username is visible as 'ali'
  And Click Delete Account button
  Then Verify that 'ACCOUNT DELETED!' is visible
