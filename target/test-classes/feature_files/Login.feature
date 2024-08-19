@TutorialsNinjaLogin
Feature: Login Functionality of TutorialsNinja

  @ValidCredentials
  Scenario Outline: Login With Valid Credentials
    Given User navigates to login page
    When User enters valid email <emails>
    And User enters valid password <passwords>
    And User clicks on Login button
    Then User is redirected to Account Page
    Examples:
    |emails										|passwords		 |
    |hihello5@gmail.com	       |12345|
    |hihello2@gmail.com	       |12345|
    |hihello3@gmail.com	       |12345|
    |hihello4@gmail.com	       |12345|
    

  

 