@US5 @SmokeTest
Feature: US_0005_Register_User_with_existing_email

Background: User is on the Automation Exercise homepage
  Given User go to homepage
  Given Verify that home page is visible successfully

Scenario: TC01 Register User with existing email

  Given Click on Signup - Login button
  Then Verify that 'New User Signup!' is visible
  When Enter a valid name
  When Enter an already registered email address
  And User click signup button
  Then Verify error 'Email Address already exist!' is visible