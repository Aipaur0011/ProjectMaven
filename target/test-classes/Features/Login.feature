Feature: Login Functionalities

  @validLogin
  Scenario: Valid Admin login
    #Given open the browser and launch HRMS application    // This will handled by Hooks "precondition"
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully
    #And Close the browser     // This will handled by Hooks "post condition "

  @adminLogin
  Scenario: Valid Admin login
    #Given open the browser and launch HRMS application
    When user enters valid "ADMIN" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully
    #And Close the browser



    #HOOKS: For defining pre and Post steps in any Cucumber framework
    #     : This is always created inside the StepDefinitions folder
    #     : Hooks will take care of pre and post conditions irrespective
    #     : of what goes in between the tes

  @scenarioOutline
  #Parametrization/Data Driven

  Scenario Outline:

    #Given open the browser and launch HRMS application
    When user enters valid "<username>" and valid "<password>"
    And click on login button
    Then user is logged in successfully
    #And Close the browser

    Examples:
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |

  @dataTable
  Scenario: Login with multiple credentials using data table
    When user enters username and password and verifies login
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |




    #hard Code
    # config file
    #===============
    #Cucumber Expression [ limited set of test data]
    #Scenario Outline    [Parametrization],[Data Driven Testing][Browser will open and close number of times we have test data in Examples table]
    #data Table

    # Page Object Model : An object Repository [ It stores or holds all the webElements specific to a particular page]