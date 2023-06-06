Feature: Searching the employee

  Background:
    When user enters valid email and valid password
    And click on login button
    When user clicks in PIM option

  @searchId
  Scenario: search employee by id
#    Given open the browser and launch HRMS application
#    When user enters valid email and valid password
#    And click on login button
#    When user clicks on PIM option
    When  user enters valid employee id
    And Clicks on search button
    And user see employee information is displayed
#    And Close the browser


  @jobTitle
  Scenario: Search Employee by Job Title
#    Given open the browser and launch HRMS application
#    When user enters valid email and valid password
#    And click on login button
#    When user clicks on PIM option
    When user select Job Title
    And Clicks on search button
    And user see employee information is displayed

 # Background: This is used to define all the common steps that multiple