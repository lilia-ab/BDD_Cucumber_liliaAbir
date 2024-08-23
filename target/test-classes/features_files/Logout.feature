@TutorialsNinjaLogout
Feature: Logout Functionality of TutorialsNinja

@Logout
Scenario: Logout scenario of TutorialsNinja

Given User navigate to login
When User enters valid user name emailhihello5@gmail.com
And User enters valid password12345
And User clicks on login 
And User clicks on Logout link
Then User is redirected to home page



