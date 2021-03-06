@US1 @SmokeTest

Feature: US_001_User_successfully_registers_on_the_website

  Background: User is on the Automation Exercise homepage
    Given User go to homepage
    Given Verify that home page is visible successfully

  Scenario: TC01 User should be able to register with valid credentials
    Given Click on Signup - Login button
    Then Verify that 'New User Signup!' is visible
    When Enter a name

    When Enter an email address
    And User click signup button
    Then Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And User fill: Title, Name, Email, a password "jlkdsfa", Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    When Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    Then Verify that 'ACCOUNT CREATED!' is visible
    Then User click Continue button
    Then Verify that 'Logged in as username' is visible
    When Click Delete Account button
    Then Verify that 'ACCOUNT DELETED!' is visible
    Then User click Continue button




