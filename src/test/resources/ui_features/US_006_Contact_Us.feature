Feature: US_06_Contact_Us_Form
  Background: User is on the Automation Exercise homepage
    Given User go to homepage
    Given Verify that home page is visible successfully

Scenario: TC_01-Contact_Us_Form
    And User clicks on contact us page button
    When Verify get in touch is visible
    Then User enter name,email,subject and message
    When User upload file
    Given User clicks submit button
    # //  Given User clicks ok button
    Given Verify success message is visible
    Then User clicks home button and verify to home page successfully

