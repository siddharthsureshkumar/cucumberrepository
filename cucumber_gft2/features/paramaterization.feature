Feature: Login Action

  Scenario Outline: Successful Login with valid credentials
    Given User is open the application
    When User click on to signin link
    And User enters "<username>" and "<password>"
    Then Message displayed Login Successfully

    Examples: 
      | username | password    |
      | lalitha  | password123 |
      | admin    | password456 |
