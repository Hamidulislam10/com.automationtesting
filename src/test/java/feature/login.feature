 
Feature: 
  verify login functionality

  @Smoke
  Scenario:  verify the correct user and password
    Given  login to site url
    When enter user name 
    And enter password
    And click login button
    
 
