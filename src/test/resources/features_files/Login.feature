@TutorialsNinjaLogin
Feature: Login Functionality of TutorialsNinja

  @ValidCredentials
  Scenario Outline: Login With Valid Credentials
    Given User navigates to loginpage
    When User enters valid user emailhihello5@gmail.com
    And User enters valid pass password12345
    And User clicks on Login button
    Then User is redirected to Account Page
    

  

 