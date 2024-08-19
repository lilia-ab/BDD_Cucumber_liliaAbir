@TutorialsNinjaRegistration
Feature: Register Functionality of TutorialsNinja

  

  @AllFields
  Scenario: Register With All Fields
    Given User navigates to Register page
    When User enters below all fields
      | firstname       | hi     |
      | lastname        | hello        |
      | telephone       | 156489887   |
      | password        | 12345 |
      | confirmpassword | 12345 |
    And User selects Yes for Newsletter
    And User selects Privacy Policy checkbox
    And User clicks on Continue button
    Then User account gets created successfully

 